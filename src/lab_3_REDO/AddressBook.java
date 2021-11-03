package lab_3_REDO;


import java.util.*;

public class AddressBook {
    ArrayList<Contact> personalContacts = new ArrayList<>();
    ArrayList<Contact> businessContacts = new ArrayList<>();





    public void addPersonalContact(String firstName, String lastName, PhoneNumber phone, Address address, Email email, String note) {
       personalContacts.add(new Contact(firstName, lastName, phone, address, email, note));
    }


    public void addBusinessContact(String BusinessName) {
        businessContacts.add(new Contact(BusinessName));
    }

    public void deletePersonalContact(String firstName, String lastName) {
        for (int i = 0; i < personalContacts.size(); i++) {
            if (getPersonalContacts().get(i).getFirstName().equals(firstName) && getPersonalContacts().get(i).getLastName().equals(lastName))
                personalContacts.remove(i);
        }

    }

    public void deleteBusinessContact(String businessName) {
        for (int i = 0; i < personalContacts.size(); i++) {
            if (getPersonalContacts().get(i).getFirstName().equals(businessName))
                businessContacts.remove(i);
        }
    }
        public ArrayList<Contact> getPersonalContacts () {
            return personalContacts;
        }

        public ArrayList<Contact> getBusinessContacts () {
            return businessContacts;
        }

        public void listPersonalContacts() {
            for (Contact c : getPersonalContacts())
                System.out.println(c);

        }
    public void listBusinessContacts() {
        for (Contact c : getBusinessContacts())
            System.out.println(c);
            System.out.println("\n");

    }

    public void addPersonalAddress(int type, String street, String city, String state, int zip){

    }




        public static void main (String[]args){

        AddressBook a = new AddressBook();
//            a.addPersonalContact("Charles", "Carpenter");
//            a.listPersonalContacts();
//
//
//            //a.deletePersonalContact("Charles", "Carpenter");
//            System.out.println("__________________");
//            for (Contact c : a.getPersonalContacts())
//                System.out.println(c);


        }
    }
