package lab_3;

import java.util.ArrayList;

public class Business {
    private String businessName;

    private ArrayList<PhoneNumber> phoneNumbers;
    private ArrayList<Email> emails;
    private ArrayList<Address> addresses;


    public Business(String name){
        this.businessName = name;
    }

public String getBusinessName(){
        return this.businessName;
}



}
