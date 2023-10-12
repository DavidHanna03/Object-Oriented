public class StandardMember extends Member {

    /**
     *  the fee as $100 plus tax (13%)
     */
    @Override
    public double getFee() {
        return 100 + (0.13 * 100);
    }


    public StandardMember(String name, String address) {
        // calls super class constructor
        super(name, address);
    }

}