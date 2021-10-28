package lab_2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class question_8 {

    public static void fortuneTeller() {
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        String choice = "";



        list.add("You will get 4.0 GPA this semester.");
        list.add("Happiness is programming.");
        list.add("Satisfaction follows hard work");
        list.add("Patience is virtue");
        list.add("You will win at Life");
        list.add("understanding is won by pain");
        list.add("The path out of hell is through suffering");
        list.add("You lose");
        list.add("Your life will eat you alive");
        list.add("There's a chance things will workout");
        list.add("Lucky outcome");

        do {
            System.out.println("Do you want your Fortune");
            choice = "";

            String check = input.next();
            if (check.equalsIgnoreCase("Y") || check.equalsIgnoreCase("N"))
                choice = check;
            else
                System.out.println("invalid input");

            if(choice.equalsIgnoreCase("Y"))
            System.out.println(list.get(random.nextInt(10)));
            System.out.println("\n");



        }while (choice.equalsIgnoreCase("Y"));


        }




    public static void main(String[] args) {
        fortuneTeller();
    }
}
