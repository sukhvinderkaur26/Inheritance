package abstractClassConcept;

public abstract class Bank {
    private String name;
    private String address;
    private String policy;
    private double rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public double getRate() {
        return rate;
    }
    //create abstract method
    public abstract void calculateRateOfInterest();
}
