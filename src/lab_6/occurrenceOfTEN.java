package lab_6;

import java.io.*;

public class occurrenceOfTEN {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\carpe\\Desktop\\number10.txt");

        if(f.exists() && f.canRead()){
           try{
               FileReader reader = new FileReader(f);
               BufferedReader bReader = new BufferedReader(reader);
               String result = bReader.readLine();

               int count = 0;
               String[] nums = (result.split(" "));
               for (String i : nums) {
                  if(Integer.parseInt(i) == 10)
                      count++;
               }
               System.out.println("This file contains [" + count + "] occurrences of the number 10");
               bReader.close();
               reader.close();

           } catch (Exception e) {
               System.out.println("No file exists");
               e.printStackTrace();
           }




        }
    }
}
