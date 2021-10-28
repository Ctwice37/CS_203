package lab_1;


import myutil.MealCard;
import myutil.Person;

public class test{
    public static void main(String[] args) {

//        cat c1 = new cat("kitty");
//
//
//        System.out.println(c1.getName());
//       System.out.println(c1.getWeight());
//
//
//        Person p = new Person();
//        p.setName("Charlie");
//
//        System.out.println(p.getName());

        MealCard m1 = new MealCard();
        MealCard m2 = new MealCard(200);

        m1.purchaseFood(99);
        m2.purchaseFood(201);
        m2.addPoints(1);
        m2.purchaseFood(201);

        System.out.println(m1.getPoints());
        System.out.println(m2.getPoints());

    }

}
