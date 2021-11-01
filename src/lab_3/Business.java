package lab_3;

import java.util.ArrayList;

public class Business {
    private String businessName;

    private ArrayList<Integer> phoneNumbers;
    private ArrayList<String> emails;
    private ArrayList<Address> addresses;
    private ArrayList<String> notes;


    public Business(String name){
        this.businessName = name;
    }

public String getBusinessName(){
        return this.businessName;
}

    public void addPhone(int Phone){
        phoneNumbers.add(Phone);
    }
    public void addEmail(String email){
        emails.add(email);
    }
    public void addNote(String note){
        notes.add(note);
    }
    public void addAddress(Address address){
        addresses.add(address);
    }


    public ArrayList<Integer> getPhoneNumbers() {
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
