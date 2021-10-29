package lab_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Person> personContact = new ArrayList<>();
    ArrayList<Business> businessContact = new ArrayList<>();


    public void addPerson(){
        Scanner input = new Scanner(System.in);
        System.out.println("Person's First Name: ");
        String firstName = input.next();
        System.out.println("Person's Last Name: ");
        String lastName = input.next();

        personContact.add(new Person(firstName, lastName));

    }

    public void addBusiness(){
        Scanner input = new Scanner(System.in);
        System.out.println("Company Name: ");
        String businessName = input.next();

        businessContact.add(new Business(businessName));
    }


    public void removePerson(String first, String last) {
        int x = personContact.size() -1;
        for (int i = 0; i < x; i++) {
            if (personContact.get(i).getPersonName().equalsIgnoreCase(first + " " + last))
                personContact.remove(i);
        }
    }

    public void removeBusiness(String business) {
        int x = businessContact.size() - 1;
        for (int i = 0; i < x; i++) {
            if (businessContact.get(i).getBusinessName().equalsIgnoreCase(business))
                businessContact.remove(i);
        }
    }

    public void listBusinesses(){
        Arrays.sort(businessContact.toArray());

       Business[] business = businessContact.toArray(Business[]::new);

       for (Business b : business)
           System.out.println(b.getBusinessName());
       }


    public void listPersons() {
        Person[] person = personContact.toArray(Person[]::new);
        for (Person p : person)
            System.out.println(p.getPersonName());


    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        addressBook.addBusiness();
        addressBook.addBusiness();


        addressBook.listBusinesses();

        System.out.println("__________________");



        //addressBook.removeBusiness("apple");

        //addressBook.listBusinesses();

    }
}