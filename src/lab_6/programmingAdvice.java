package lab_6;

import java.io.*;
import java.util.Scanner;

public class programmingAdvice {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\carpe\\Desktop\\programmingAdvice.txt");

        if(f.exists() && f.canRead()) {
            FileReader reader = null;
            try {
                reader = new FileReader(f);
                BufferedReader buffer = new BufferedReader(reader);
                char s = buffer.readLine().charAt(0);
                System.out.println(buffer.readLine());

                reader.close();
                buffer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            Scanner input = new Scanner(System.in);
            System.out.println("\n\n....What advice do you have to add? ");


            try {
                FileWriter writer = new FileWriter("C:\\Users\\carpe\\Desktop\\programmingAdvice.txt", true);
                BufferedWriter bWriter = new BufferedWriter(writer);
                bWriter.write(input.nextLine());
                bWriter.close();
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }



        }

    }

}
