package lab_3_REDO;

import java.util.ArrayList;

public class Contact {
    private String firstName;
    private String lastName;
    private String notes;

    private ArrayList<PhoneNumber> phoneNumbers;
    private ArrayList<Address> addresses = new ArrayList<>();
    private ArrayList<Email> emails;


    public Contact(String firstName, String lastName, PhoneNumber phoneNumber, Address address, Email email, String note) {     //personalContact
        this.firstName = firstName;
        this.lastName = lastName;
        phoneNumbers.add(phoneNumber);
        addresses.add(address);
        emails.add(email);
        this.notes = note;

    }
    public Contact(String firstName) {                      //businessContact
        this.firstName = firstName;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ArrayList<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public ArrayList<Email> getEmails() {
        return emails;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
    public void addAddress(int type, String street, String city, String state, int zip){
        addresses.add(new Address(type, street, city, state,zip));
    }
}
