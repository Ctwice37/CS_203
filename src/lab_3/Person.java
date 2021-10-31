package lab_3;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;



    private ArrayList<Integer> phoneNumbers= new ArrayList<>();
    private ArrayList<String> emails= new ArrayList<>();
    private ArrayList<Address> addresses = new ArrayList<>();
    private ArrayList<String> notes= new ArrayList<>();

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, String street, String city, String state, int zip){
        this.firstName = firstName;
        this.lastName = lastName;
        addresses.add(new Address(street, city, state, zip));
    }


    public void addEmail(String email){
        emails.add(email);
    }

    public void addPhone(int phoneNumber){
        phoneNumbers.add(phoneNumber);
    }
    public void addAddress(String street, String city, String state, int zip){
        addresses.add(new Address(street, city, state, zip));
    }
    public void addNote(String personalNote){
        notes.add(personalNote);
    }


    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public String getPersonName(){
        return this.firstName + " " + this.lastName;
    }

    public void printAddresses(){
        if(this.addresses == null){
            System.out.println("No address on file");
        }else
            for(Address a : addresses)
                System.out.println(a);

    }

    public void getPersonInfo(){
        System.out.println(this.firstName +
                " " + this.lastName);



        if(!phoneNumbers.isEmpty()){
            System.out.println("\nPhone Numbers: ");
            for(int i : phoneNumbers)
                System.out.println(i);
        }else System.out.println("\nPhone Numbers: NULL");

        if(!emails.isEmpty()){
            System.out.println("\nEmail Addresses:");
            for(String i : emails){
                System.out.println(i);
            }
        } else System.out.println("\nEmail Addresses: NULL");

        if(!notes.isEmpty()){
            System.out.println("\nNotes:");
            for (String i : notes){
                System.out.println(i);
            }
        }else System.out.println("\nNotes: NULL");

        if(!addresses.isEmpty()){
            System.out.println("\nAddresses:");
            for(Address a : addresses)
                System.out.println(a);
        }else System.out.println("\nAddresses: NULL");
    }



}
