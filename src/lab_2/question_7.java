package lab_2;

public class question_7 {

      static double[] arr = new double[365];



    public static void findHottestColdest(double[] arr) {
        double hottest = arr[0];
        double coldest = arr[0];


        for (double i : arr) {
            if (i > hottest)
                hottest = i;
            if (i < coldest)
                coldest = i;
        }
        System.out.println("coldest: " + coldest + "\nhottest: " + hottest);


    }

    public static void main(String[] args) {

        arr[3] = 3.3;                       //To test maximum value ... make at least one index a non 0.0 value;
        findHottestColdest(arr);
    }
}