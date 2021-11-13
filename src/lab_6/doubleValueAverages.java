package lab_6;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class doubleValueAverages {
    public static void main(String[] args){
        File f = new File("C://Users//carpe//Desktop//doubles.txt");
        try {
        if(f.exists() && f.canRead()){
            FileReader reader  = new FileReader(f);
            BufferedReader buffRead = new BufferedReader(reader);
            String s = buffRead.readLine();

            double sum = 0;
            double count = 0;
            double average = 0;

            String[] string = s.split(" ");
            for(String i : string) {
                sum += Double.parseDouble(i);
                count++;
            }
            average = sum/count;
            System.out.println("average = " + average);
            } }catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
