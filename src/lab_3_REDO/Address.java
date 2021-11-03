package lab_3_REDO;

public class Address {
    private int type;
    private String street;
    private String city;
    private String state;
    private int zip;

    public Address(){
        type = 0;
        street = "Sesame Street";
        city = "Crazy Town";
        state = "NoWhere";
        zip = 66666;
    }
    public Address(int type, String street, String city, String state, int zip) {
        this.type = type;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
