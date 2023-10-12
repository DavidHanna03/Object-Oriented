public class TestMember {
    public static void main(String[] args) {
        // create the members
        Member jane = new StandardMember("Jane", "1 queen st. ");
        Member mike = new SeniorMember("mike", "1 king st. ", 60);
        Member noah = new SeniorMember("Noah", "100 king st. ", 40);
        // create the society
        Society ontarioTech = new Society("ontario Tech");
        // add members to the socitey
        ontarioTech.addMember(mike);
        ontarioTech.addMember(jane);
        ontarioTech.addMember(noah);
        // create the Managment committee
        ManagementCttee managementCttee = new ManagementCttee();
        // check if Mike is a senior member in the society
        if (mike.isSeniorMember()) {
            managementCttee.addMember((SeniorMember) mike);
        }
        // add the management committee to the scoiety
        ontarioTech.setManagementCttee(managementCttee);
        // list all the members in the committee
        ontarioTech.listAllMemebrs();
        // list all the members in the committee
        System.out.println("Total Fee: " + ontarioTech.getFeeTotal());
    }
}
