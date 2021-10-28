package lab_2;

public class question_5 {


    public static boolean checkEquality(int[] x, int[] y){

        if(x.length != y.length)
            return false;
        for(int i = 0; i < x.length; i++){
            if (x[i] != y[i])
                return false;

        } return true;

    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(checkEquality(arr1,arr2));
    }
}
