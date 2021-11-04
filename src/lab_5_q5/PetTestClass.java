package lab_5_q5;

import java.util.ArrayList;

public class PetTestClass {
    static ArrayList<Pet> pets = new ArrayList<>();

    public static void main(String[] args) {
        Pet c1 = new Pet("Sparkles", 'c');
        Pet c2 = new Pet("Nellie", 'd');
        Pet c3 = new Pet("Luna", 'd');
        Pet c4 = new Pet("Marcus", 'c');

        pets.add(c1);
        pets.add(c2);
        pets.add(c3);
        pets.add(c4);

        for(Pet p : pets)
            System.out.println(p);
    }
}
