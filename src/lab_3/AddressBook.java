package lab_3;

import java.util.ArrayList;

public class AddressBook {
    ArrayList<Person> personContact = new ArrayList<>();
    ArrayList<Business> businessContact = new ArrayList<>();


    public void addPerson(String firstName, String lastName){
        personContact.add(new Person(firstName, lastName));

    }

    public void addBusiness(String businessName){
        businessContact.add(new Business(businessName));
    }





    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();


        addressBook.
    }
}