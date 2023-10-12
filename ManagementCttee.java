public class ManagementCttee {
    // fields
    private SeniorMember[] ctteeMembers;
    // variable to hold index
    private int numRecords = 0;

    public ManagementCttee() {
        // initialize the array with maximum of 100 members
        ctteeMembers = new SeniorMember[100];
    }

    /**
     * Add SeniorMember to the array
     *
     */
    public void addMember(SeniorMember s) {
        if (numRecords < ctteeMembers.length) {
            ctteeMembers[numRecords] = s;
            numRecords++;
        }
    }

    /**
     * Removes a SeniorMember with the passed name from array
     *
     */
    public void removeCtteeMember(String name) {
        // iterate from first till end of the array
        for (int index = 0; index < numRecords; index++) {
            // check if name matches
            if (ctteeMembers[index].getName().equalsIgnoreCase(name)) {
                // iterate from removeIndex till end of the array
                for (int removeIndex = index; removeIndex < numRecords; removeIndex++) {
                    // assign next index element to current index
                    ctteeMembers[removeIndex] = ctteeMembers[removeIndex + 1];
                }
                ctteeMembers[numRecords - 1] = null;
                // decrement the number of records by 1
                numRecords -= 1;
            }
        }
    }

}