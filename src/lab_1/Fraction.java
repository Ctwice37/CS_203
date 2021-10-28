package lab_1;

public class Fraction {

    private int numerator;
    private int denominator;


    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //Question 6. Static


    public static int compare1(Fraction f1, Fraction f2){
        if ((f1.numerator / f1.denominator) > (f2.numerator / f2.denominator))
            return 1;
        else if ((f1.numerator / f1.denominator) < (f2.numerator / f2.denominator))
            return -1;
        else
            return 0;
    }

    //question 7. nonStatic,, instance method

//    public int compare1(Fraction f1){
//        if (f1.numerator / f1.denominator > this.numerator / this.denominator)
//            return 1;
//        else if (f1.numerator / f1.denominator < this.numerator / this.denominator)
//            return -1;
//        else
//            return 0;
//    }


    public static void main(String[] args){
        Fraction f1 = new Fraction(12, 10);
        Fraction f2 = new Fraction(22, 10);

       System.out.println(compare1(f1,f2));


    }

}
