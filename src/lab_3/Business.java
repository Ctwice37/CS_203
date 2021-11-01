package lab_3;

import java.util.ArrayList;

public class Business {
    private String businessName;

    private ArrayList<Integer> phoneNumbers;
    private ArrayList<String> emails;
    private ArrayList<Address> addresses;


    public Business(String name){
        this.businessName = name;
    }

public String getBusinessName(){
        return this.businessName;
}



}
