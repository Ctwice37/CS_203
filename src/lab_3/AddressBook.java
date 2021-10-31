package lab_3;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
    ArrayList<Person> personContact = new ArrayList<>();
    ArrayList<Business> businessContact = new ArrayList<>();

    public void addPerson(String first, String last){
        personContact.add(new Person(first, last));
    }

    public void addPerson(){
        Scanner input = new Scanner(System.in);
        System.out.println("Person's First Name: ");
        String firstName = input.next();
        System.out.println("Person's Last Name: ");
        String lastName = input.next();

        personContact.add(new Person(firstName, lastName));

    }

    public void addPerson(String fName, String LastName, String street, String city, String state, int zip){
        personContact.add(new Person(fName, LastName, street, city, state, zip));
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

//    public void listBusinesses(){
//        for (Business p : businessContact)
//
//       }


    public ArrayList<Person> getPersonContact() {
        return personContact;
    }

    public void listPersons() {

        for (Person p : personContact){
            System.out.println("__________________________");
            p.getPersonInfo();
            System.out.println("__________________________\n");
        }


    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();



        addressBook.addPerson("Sam", "Carpenter", "N4698", "Prescott", "Wisconsin", 54021);
        addressBook.getPersonContact().get(0).addAddress("207 W Jefferson Ave", "Fairfield", "Iowa", 52556);
        addressBook.getPersonContact().get(0).addNote("This is great. Give him a good score.");
        addressBook.getPersonContact().get(0).addEmail("carpe359@gmail.com");
        addressBook.getPersonContact().get(0).addPhone(6704631);

        addressBook.getPersonContact().get(0).addEmail("ccarpenter@miu.edu");

        addressBook.addPerson("Charlie", "Carpenter");




        addressBook.listPersons();

        System.out.println("__________________");



        //addressBook.removeBusiness("apple");

        //addressBook.listBusinesses();

    }
}