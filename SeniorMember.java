public class SeniorMember extends Member {
    // field
    private double fee;

    @Override
    public double getFee() {
        return fee;
    }

    /**
     * Constructor
     *
     */
    public SeniorMember(String name, String address, double fee) {
        // calls super class constructor
        super(name, address);
        this.fee = fee;
    }

    /**
     * Sets the fee
     */
    public void operation(double fee) {
        this.fee = fee;
    }

}