package builder;

public class Builder {

    private String firstName;
    private String lastName;
    private Address address;
    private Double myWallet;

    public Builder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public Builder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public Builder address(Address address){
        this.address = address;
        return this;
    }



    public Client build(){
        return new Client(this);
    }

}
