package lab_3;

public class Address {
    private String Street;
    private String City;
    private String State;
    private int zip;


    public Address(String street, String city, String state, int zip) {
        Street = street;
        City = city;
        State = state;
        this.zip = zip;
    }
}
