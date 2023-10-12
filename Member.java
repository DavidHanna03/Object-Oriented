
public abstract class Member {
    private String name;
    private String address;


    public Member(String name, String address) {
        this.name = name;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    /**
     * the address
     */
    public String getAddress() {
        return address;
    }

    public abstract double getFee();

    /**
     * true if member is senior else false
     */
    public boolean isSeniorMember() {
        if (this instanceof SeniorMember) {
            return true;
        }
        return false;
    }
}