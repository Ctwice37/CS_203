package lab_3;

import java.util.ArrayList;

public class Business {
    private String businessName;

    private ArrayList<phoneNumber> phoneNumbers;
    private ArrayList<String> emails;
    private ArrayList<Address> addresses;
    private ArrayList<String> notes;


    public Business(String name){
        this.businessName = name;
    }

    public Business(String businessName, String Street, String city, String state, int zip){
        this.businessName = businessName;
        addresses.add(new Address(Street, city, state, zip));
    }

public String getBusinessName(){
        return this.businessName;
}

    public void addPhone(int type, int number){
        phoneNumbers.add(new phoneNumber(type, number));
    }
    public void addEmail(String email){
        emails.add(email);
    }
    public void addNote(String note){
        notes.add(note);
    }
    public void addAddress(String street, String city, String state, int zip ){
        addresses.add(new Address(street, city, state, zip));
    }


    public ArrayList<phoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public ArrayList<String> getNotes() {
        return notes;
    }
}
