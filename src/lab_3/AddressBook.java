package lab_3;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
    ArrayList<Person> personContact = new ArrayList<>();
    ArrayList<Business> businessContact = new ArrayList<>();

    public void addPerson(String first, String last) {
        personContact.add(new Person(first, last));
    }

    public void addPerson() {
        Scanner input = new Scanner(System.in);
        System.out.println("Person's First Name: ");
        String firstName = input.next();
        System.out.println("Person's Last Name: ");
        String lastName = input.next();

        personContact.add(new Person(firstName, lastName));

    }

    public void addPerson(String fName, String LastName, String street, String city, String state, int zip) {
        personContact.add(new Person(fName, LastName, street, city, state, zip));
    }

    public void addBusiness() {
        Scanner input = new Scanner(System.in);
        System.out.println("Company Name: ");
        String businessName = input.next();

        businessContact.add(new Business(businessName));
    }


    public void removePerson(String first, String last) {
        int x = personContact.size() - 1;
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

    public void editContacts() {
        int personEntry = 1;
        int entrySelection = 0;
        int count = 1;
        int AttributeSelection;
        Scanner input = new Scanner(System.in);
        System.out.println("Business Contact or Person Contact?");
        //if(input.next().equalsIgnoreCase("Business")){}


        if (input.next().equalsIgnoreCase("Person")) {

            if (!(personContact.isEmpty())) {
                for (Person p : personContact) {
                    System.out.println("Entry " + count++ + ":");
                    System.out.println(p.getPersonName());
                }
                System.out.println("\nWhich Person Would you like to edit?");
                personEntry = input.nextInt() - 1;
                System.out.println("You want to edit contact: \n" +
                        personContact.get(personEntry).getPersonName() + "?");
                if (input.next().equalsIgnoreCase("yes")) {
                    System.out.println("Which attribute do you want to edit?");
                    System.out.println("1 - PhoneNumber\n2 - emailAddress\n" +
                            "3 - Note\n4 - Address");
                    entrySelection = input.nextInt();
                }
                int selection = 1;
                switch (entrySelection) {

                    case 1: {
                        ArrayList<Long> a = getPersonContact().get(personEntry).getPhoneNumbers();
                        System.out.println("which phone Number do you want to edit?");
                        for (Long i : a) {
                            System.out.println(selection++ + " ------ " + i);
                        }
                        int choice = input.nextInt() - 1;
                        Long previousNumber = getPersonContact().get(personEntry).getPhoneNumbers().get(choice);
                        System.out.println("Change phone number: " + getPersonContact().get(personEntry).getPhoneNumbers().get(choice) + "?");
                        if (input.next().equalsIgnoreCase("yes")) {
                            System.out.println("Input revised phone Number");
                            Long newNumber = input.nextLong();
                            personContact.get(personEntry).getPhoneNumbers().set(choice, newNumber);
                            System.out.println(previousNumber + " has successfully been changed to: " + getPersonContact().get(personEntry).getPhoneNumbers().get(choice));
                        }

                        break;
                    }
                    case 2: {
                        ArrayList<String> a = getPersonContact().get(personEntry).getEmails();
                        System.out.println("which email do you want to edit?");
                        for (String i : a) {
                            System.out.println(selection++ + " ------ " + i);
                        }
                        int choice = input.nextInt() - 1;
                        String previousEmail = getPersonContact().get(personEntry).getEmails().get(choice);
                        System.out.println("Change email: " + getPersonContact().get(personEntry).getEmails().get(choice) + "?");
                        if (input.next().equalsIgnoreCase("yes")) {
                            System.out.println("Input revised email address");
                            String newEmail = input.next();
                            personContact.get(personEntry).getEmails().set(choice, newEmail);
                            System.out.println(previousEmail + " has successfully been changed to: " + getPersonContact().get(personEntry).getEmails().get(choice));
                            break;
                        }
                    }
                    case 3: {
                        ArrayList<String> a = getPersonContact().get(personEntry).getNotes();
                        System.out.println("which Note do you want to edit?");
                        for (String i : a) {
                            System.out.println(selection++ + " ------ " + i);
                        }
                        int choice = input.nextInt() - 1;
                        String previousNote = getPersonContact().get(personEntry).getNotes().get(choice);
                        System.out.println("Change Note: " + getPersonContact().get(personEntry).getNotes().get(choice) + "?");
                        if (input.next().equalsIgnoreCase("yes")) {
                            System.out.println("Input revised Note");
                            String newNote = input.next();
                            personContact.get(personEntry).getNotes().set(choice, newNote);
                            System.out.println(previousNote + " has successfully been changed to: " + getPersonContact().get(personEntry).getNotes().get(choice));
                            break;
                        }
                    }
                    case 4: {
                        ArrayList<Address> a = getPersonContact().get(personEntry).getAddresses();
                        System.out.println("which address do you want to edit?");
                        for (Address i : a) {
                            System.out.println(selection++ + " ------ " + i);
                        }
                        int choice = input.nextInt() - 1;
                        Address previousAddress = new Address(getPersonContact().get(personEntry).getAddresses().get(choice).getStreet(), getPersonContact().get(personEntry).getAddresses().get(choice).getCity(), getPersonContact().get(personEntry).getAddresses().get(choice).getState(), getPersonContact().get(personEntry).getAddresses().get(choice).getZip());
                        System.out.println("Change address: " + getPersonContact().get(personEntry).getAddresses().get(choice) + "?");
                        if (input.next().equalsIgnoreCase("yes")) {
                            System.out.println("Input new Street");
                            System.out.println("Input new City");
                            System.out.println("Input new State");
                            System.out.println("Input new zip");;

                            Address change = personContact.get(personEntry).getAddresses().get(choice);
                            //change.setStreet(Address.StreetInput(input.nextLine()));
                            change.setCity(input.next());
                            change.setState(input.next());
                            change.setZip(input.nextInt());
                            System.out.println(previousAddress + " has successfully been changed to: " + getPersonContact().get(personEntry).getAddresses().get(choice));
                            break;
                        }
                    }
                }
            }
        }
    }



    public ArrayList<Person> getPersonContact() {
        return personContact;
    }

    public void listPersons() {

        for (Person p : personContact) {
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
        addressBook.getPersonContact().get(0).addPhone(6704631l);
        addressBook.getPersonContact().get(0).addPhone(1232122l);

        addressBook.getPersonContact().get(0).addEmail("ccarpenter@miu.edu");

        addressBook.addPerson("Charlie", "Carpenter");


        addressBook.getPersonContact().get(0).getAddresses().get(0).setCity("Seatle");


        addressBook.listPersons();

        System.out.println("__________________");


        addressBook.editContacts();


        //addressBook.removeBusiness("apple");

        //addressBook.listBusinesses();

    }
}