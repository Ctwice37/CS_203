package lab_3;

import java.util.ArrayList;

import java.util.Collections;

public class AddressBook {
    ArrayList<Person> personContact = new ArrayList<>();
    ArrayList<Business> businessContact = new ArrayList<>();


    public void addPerson(String firstName, String lastName){
        personContact.add(new Person(firstName, lastName));

    }

    public void addBusiness(String businessName){
        businessContact.add(new Business(businessName));
    }


    public void removePerson{}

    public void removeBusiness{}


    public void listBusinesses(){}

    public void showPersons(){}





    //helper methods


    public Business SelectFromBusinessContacts(){

        return b;
    }


    public Person SelectFromPersonContacts(){


        return p;
    }
















    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();



    }
}