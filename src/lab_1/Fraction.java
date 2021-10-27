package lab_1;

public class Fraction {



    public static int compare(Fraction f1, Fraction f2){

        int x = compare(f1, f2);

        if(x == -1)
            return -1;
        else if (f1 == f2)
            return 0;
        else
            return 1;
    }
}
