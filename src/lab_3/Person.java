package lab_3;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;

    private ArrayList<PhoneNumber> phoneNumbers;
    private ArrayList<Email> emails;
    private ArrayList<Address> addresses;
    private ArrayList<Note> notes;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void addEmail(String email){
        emails.add(new Email(email));
    }
    public void addPhone(int phoneNumber){
        phoneNumbers.add(new PhoneNumber(phoneNumber));
    }
    public void addAddress(String street, String city, String state, int zip){
        addresses.add(new Address(street, city, state, zip));
    }
    public void addNote(String personalNote){
        notes.add(new Note(personalNote));
    }


    public String getPersonName(){
        return this.firstName + " " + this.lastName;
    }

}
