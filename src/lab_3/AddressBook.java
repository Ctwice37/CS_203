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

    public void addBusiness(String businessName, String street, String city, String state, int zip){
        businessContact.add(new Business(businessName, street, city, state, zip));
    }

    public void addBusiness() {
        Scanner input = new Scanner(System.in);
        System.out.println("Company Name: ");
        String businessName = input.next();

        businessContact.add(new Business(businessName));
    }

    public void removePerson(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which contact Do you wish to Remove?\n");
        int count = 1;
        for(Person p : getPersonContact())
            System.out.println(count++ + " ------ "+p.getPersonName());
        int choice = input.nextInt()-1;
        System.out.println("\n\nConfirm:\nRemove: " + personContact.get(choice).getPersonName() + "\n\n(y/n)?");
        if (input.next().equalsIgnoreCase("y")){
            personContact.remove(choice);
            System.out.println("\nDeleted");
        }

        }


    public void removeBusiness() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which contact Do you wish to Remove?\n");
        int count = 1;
        for(Business p : getBusinessContact())
            System.out.println(count++ + " ------ "+p.getBusinessName());
        int choice = input.nextInt()-1;
        System.out.println("\n\nConfirm:\nRemove: " + businessContact.get(choice).getBusinessName() + "\n\n(y/n)?");
        if (input.next().equalsIgnoreCase("y")){
            businessContact.remove(choice);
            System.out.println("\nDeleted");
        }
    }

    public void editContacts() {
        int personEntry = 1;
        int entrySelection = 0;
        int count = 1;
        int AttributeSelection;
        Scanner input = new Scanner(System.in);
        System.out.println("Edit contact:\n\nBusiness - or - Person?");
        //if(input.next().equalsIgnoreCase("Business")){}


        if (input.next().equalsIgnoreCase("Person")) {
            System.out.println("\nWhich Person Would you like to edit?\n");
            if (!(personContact.isEmpty())) {
                for (Person p : personContact) {
                    System.out.println("Entry (" + count++ + "): " + p.getPersonName());

                }

                personEntry = input.nextInt() - 1;
                System.out.println("\nYou wish to edit (" +
                        personContact.get(personEntry).getPersonName() + ")?");
                if (input.next().equalsIgnoreCase("yes")) {
                    System.out.println("\nWhich attribute do you want to edit?");
                    System.out.println("1 - PhoneNumber\n2 - emailAddress\n" +
                            "3 - Note\n4 - Address");
                    entrySelection = input.nextInt();
                }
                int selection = 1;
                switch (entrySelection) {

                    case 1: {
                        ArrayList<phoneNumber> a = getPersonContact().get(personEntry).getPhoneNumbers();
                        System.out.println("which phone Number do you want to edit?");
                        for (phoneNumber i : a) {
                            System.out.println(selection++ + " ------ " + i);
                        }
                        int choice = input.nextInt() - 1;
                        phoneNumber previousNumber = getPersonContact().get(personEntry).getPhoneNumbers().get(choice);
                        System.out.println("Change phone number: " + getPersonContact().get(personEntry).getPhoneNumbers().get(choice) + "?");
                        if (input.next().equalsIgnoreCase("yes")) {
                            System.out.println("Input revised phone Number");
                            int newNumber = input.nextInt();
                            personContact.get(personEntry).getPhoneNumbers().get(choice).setNumber(newNumber);
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
                        if(!a.isEmpty()){
                        System.out.println("which address do you want to edit?");
                        for (Address i : a) {
                            System.out.println("------(" + selection++ + ")------" + i);
                        }
                        int choice = input.nextInt() - 1;
                        Address previousAddress = new Address(getPersonContact().get(personEntry).getAddresses().get(choice).getStreet(), getPersonContact().get(personEntry).getAddresses().get(choice).getCity(), getPersonContact().get(personEntry).getAddresses().get(choice).getState(), getPersonContact().get(personEntry).getAddresses().get(choice).getZip());
                        System.out.println("Change the following address:" + getPersonContact().get(personEntry).getAddresses().get(choice) + "\nconfirm(yes/no)");
                        if (input.next().equalsIgnoreCase("yes")) {
                            //System.out.println("Input new Street");
                            System.out.println("Input new City");
                            System.out.println("Input new State");
                            System.out.println("Input new zip");


                            Address change = personContact.get(personEntry).getAddresses().get(choice);
                            //change.setStreet(Address.StreetInput(input.nextLine()));
                            change.setCity(input.next());
                            change.setState(input.next());
                            change.setZip(input.nextInt());
                            System.out.println(previousAddress + " has successfully been changed to: " + getPersonContact().get(personEntry).getAddresses().get(choice));
                        }}else{
                            System.out.println("Contact currently has no Addresses\n\n--Create new Address--\n");
                            System.out.println("Street:");
                            System.out.println("City:");
                            System.out.println("State");
                            System.out.println(("Zip"));
                            personContact.get(personEntry).getAddresses().add(new Address(input.next(), input.next(), input.next(), input.nextInt()));
                        }
                            break;
                        }
                    }
                }
            }     else if (input.next().equalsIgnoreCase("Business")) {
            System.out.println("\nWhich Business Would you like to edit?\n");
            if (!(businessContact.isEmpty())) {
                for (Business b : businessContact) {
                    System.out.println("Entry (" + count++ + "): " + b.getBusinessName());

                }
                int businessEntry = 0;

                 businessEntry = input.nextInt() - 1;
                System.out.println("\nYou wish to edit (" +
                        businessContact.get(businessEntry).getBusinessName() + ")?");
                if (input.next().equalsIgnoreCase("yes")) {
                    System.out.println("\nWhich attribute do you want to edit?");
                    System.out.println("1 - PhoneNumber\n2 - emailAddress\n" +
                            "3 - Note\n4 - Address");
                    entrySelection = input.nextInt();
                }
                int selection = 1;
                switch (entrySelection) {

                    case 1: {
                        ArrayList<phoneNumber> a = getPersonContact().get(businessEntry).getPhoneNumbers();
                        System.out.println("which phone Number do you want to edit?");
                        for (phoneNumber i : a) {
                            System.out.println(selection++ + " ------ " + i);
                        }
                        int choice = input.nextInt() - 1;
                        phoneNumber previousNumber = getBusinessContact().get(businessEntry).getPhoneNumbers().get(choice);
                        System.out.println("Change phone number: " + getBusinessContact().get(businessEntry).getPhoneNumbers().get(choice) + "?");
                        if (input.next().equalsIgnoreCase("yes")) {
                            System.out.println("(0) LandLine or (1) CellLine");
                            int newType = input.nextInt();
                            System.out.println("Input revised phone Number");
                            int newNumber = input.nextInt();
                            businessContact.get(businessEntry).getPhoneNumbers().get(choice).setType(newNumber);
                            businessContact.get(businessEntry).getPhoneNumbers().get(choice).setNumber(newNumber);
                            System.out.println(previousNumber + " has successfully been changed to: " + getPersonContact().get(personEntry).getPhoneNumbers().get(choice));
                        }

                        break;
                    }
                    case 2: {
                        ArrayList<String> b = getBusinessContact().get(businessEntry).getEmails();
                        System.out.println("which email do you want to edit?");
                        for (String i : b) {
                            System.out.println(selection++ + " ------ " + i);
                        }
                        int choice = input.nextInt() - 1;
                        String previousEmail = getBusinessContact().get(businessEntry).getEmails().get(choice);
                        System.out.println("Change email: " + getBusinessContact().get(businessEntry).getEmails().get(choice) + "?");
                        if (input.next().equalsIgnoreCase("yes")) {
                            System.out.println("Input revised email address");
                            String newEmail = input.next();
                            businessContact.get(personEntry).getEmails().set(choice, newEmail);
                            System.out.println(previousEmail + " has successfully been changed to: " + getBusinessContact().get(businessEntry).getEmails().get(choice));
                            break;
                        }
                    }
                    case 3: {
                        ArrayList<String> b = getBusinessContact().get(businessEntry).getNotes();
                        System.out.println("which Note do you want to edit?");
                        for (String i : b) {
                            System.out.println(selection++ + " ------ " + i);
                        }
                        int choice = input.nextInt() - 1;
                        String previousNote = getBusinessContact().get(businessEntry).getNotes().get(choice);
                        System.out.println("Change Note: " + getBusinessContact().get(businessEntry).getNotes().get(choice) + "?");
                        if (input.next().equalsIgnoreCase("yes")) {
                            System.out.println("Input revised Note");
                            String newNote = input.next();
                            businessContact.get(businessEntry).getNotes().set(choice, newNote);
                            System.out.println(previousNote + " has successfully been changed to: " + getBusinessContact().get(personEntry).getNotes().get(choice));
                            break;
                        }
                    }
                    case 4: {
                        ArrayList<Address> b = getBusinessContact().get(businessEntry).getAddresses();
                        if(!b.isEmpty()){
                            System.out.println("which address do you want to edit?");
                            for (Address i : b) {
                                System.out.println("------(" + selection++ + ")------" + i);
                            }
                            int choice = input.nextInt() - 1;
                            Address previousAddress = new Address(getBusinessContact().get(businessEntry).getAddresses().get(choice).getStreet(), getPersonContact().get(businessEntry).getAddresses().get(choice).getCity(), getBusinessContact().get(businessEntry).getAddresses().get(choice).getState(), getBusinessContact().get(businessEntry).getAddresses().get(choice).getZip());
                            System.out.println("Change the following address:" + getBusinessContact().get(businessEntry).getAddresses().get(choice) + "\nconfirm(yes/no)");
                            if (input.next().equalsIgnoreCase("yes")) {
                                //System.out.println("Input new Street");
                                System.out.println("Input new City");
                                System.out.println("Input new State");
                                System.out.println("Input new zip");


                                Address change = businessContact.get(businessEntry).getAddresses().get(choice);
                                //change.setStreet(Address.StreetInput(input.nextLine()));
                                change.setCity(input.next());
                                change.setState(input.next());
                                change.setZip(input.nextInt());
                                System.out.println(previousAddress + " has successfully been changed to: " + getBusinessContact().get(businessEntry).getAddresses().get(choice));
                            }}else{
                            System.out.println("Contact currently has no Addresses\n\n--Create new Address--\n");
                            System.out.println("Street:");
                            System.out.println("City:");
                            System.out.println("State");
                            System.out.println(("Zip"));
                            businessContact.get(businessEntry).getAddresses().add(new Address(input.next(), input.next(), input.next(), input.nextInt()));
                        }
                        break;
                    }
                }
            }
        }
        }


    public ArrayList<Person> getPersonContact() {
        return personContact;
    }

    public ArrayList<Business> getBusinessContact(){
        return businessContact;
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
        addressBook.getPersonContact().get(0).addPhone(new phoneNumber(0, 123321));
        addressBook.getPersonContact().get(0).addPhone(new phoneNumber(1, 333333));

        addressBook.getPersonContact().get(0).addEmail("ccarpenter@miu.edu");

        addressBook.addPerson("Charlie", "Carpenter");


        addressBook.getPersonContact().get(0).getAddresses().get(0).setCity("Seattle");


        addressBook.listPersons();

        System.out.println("__________________");
        addressBook.addBusiness("Apple", "N4698", "Prescott", "Wisconsin", 54021);
        addressBook.getBusinessContact().get(0).addAddress("207 W Jefferson Ave", "Fairfield", "Iowa", 52556);
        addressBook.getBusinessContact().get(0).addNote("This is great. Give him a good score.");
        addressBook.getBusinessContact().get(0).addEmail("carpe359@gmail.com");
        //addressBook.getBusinessContact().get(0).addPhone(new phoneNumber(0, 123321)));
        //addressBook.getBusinessContact().get(0).addPhone(new phoneNumber(1, 333333));


        addressBook.editContacts();

        addressBook.listPersons();

        String s = new String();
        String s2 = new String();
        s.equals(s2);

        //addressBook.removeBusiness("apple");

        //addressBook.listBusinesses();

    }
}