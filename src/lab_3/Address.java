package lab_3;

public class Address {
    private String Street;
    private String City;
    private String State;
    private int zip;


    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Address(String street, String city, String state, int zip) {
        Street = street;
        City = city;
        State = state;
        this.zip = zip;


    }
    @Override
    public String toString(){
        return "\n[Street: " + this.getStreet() +
                "\nCity: " + this.getCity() +
                "\nState: " + this.getState() +
                "\nZip: " + this.getZip() +"]" + "\n";
    }


}
