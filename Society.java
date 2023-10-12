public class Society {
    // fields
    private String name;
    private Member[] members;
    private ManagementCttee managementCttee;
    private int numMembers;


    public Society(String name) {
        this.name = name;
        members = new Member[100];
        numMembers = 0;
    }

    /**
     * @return total fee
     */
    public int getFeeTotal() {
        int fee = 0;
        // iterate through the array
        for (int index = 0; index < numMembers; index++) {
            fee += members[index].getFee();
        }
        return fee;
    }


    public void setManagementCttee(ManagementCttee managementCttee) {
        this.managementCttee = managementCttee;
    }

    /**
     * Listing all members
     */
    public void listAllMemebrs() {
        System.out.println("Society Name: " + name);
        // iterate through the array
        for (int index = 0; index < numMembers; index++) {
            System.out.println("Name: " + members[index].getName() + ", Address: " + members[index].getAddress());
        }
    }

    /**
     * Add member to array
     *
     */
    public void addMember(Member member) {
        if (numMembers < members.length) {
            members[numMembers] = member;
            numMembers++;
        }
    }
}