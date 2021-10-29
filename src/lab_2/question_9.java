package lab_2;

import java.util.ArrayList;

public class question_9 {





    public static ArrayList<String> triplets(String DNA){
        int length = 0;
        StringBuilder bf1 = new StringBuilder();
        ArrayList<String> codons = new ArrayList<>();
        if(DNA.length() % 3 == 0)
            length = DNA.length();
        else if(DNA.length() % 3 == 1)
            length = DNA.length() -1;
        else
            length = DNA.length() - 2;

        for (int i = 0; i < length; i++){
            bf1.append(DNA.charAt(i));
            if((i+1)%3 == 0){
                codons.add(bf1.toString());
                bf1.setLength(0);
            }

        }return codons;
    }

    public static void main(String[] args) {
        String DNA = "ACGACGGATAAA";

        for(String x : triplets(DNA))
            System.out.println(x);
    }

}
