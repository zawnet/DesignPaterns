package builder;

public class AddressBuilder {

    private String city;
    private String street;
    private int homeNumber;
    private String zipCode;

    public Address build(){
        return  new Address();
    }
}
