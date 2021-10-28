package lab_2;

public class question_4 {

    public static String findMaxMin(int[] arr){

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        return max + " is the maximum and the minimum is " + min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 8, 98, 3, 1};
        System.out.println(findMaxMin(arr));
    }
}
