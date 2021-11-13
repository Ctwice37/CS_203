package lab_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class BoysGirls_Names {
    public static void main(String[] args) {
        try {

            File f = new File("C:\\Users\\carpe\\Desktop\\boynames.txt");
            if(f.exists() && f.canRead()) {
                FileReader reader = new FileReader(f);
                BufferedReader bReader = new BufferedReader(reader);
                StringBuffer stringB = new StringBuffer();
                String line = null;
                while ((line = bReader.readLine())  != null){
                    stringB.append(line);
                }
                String[] frequency = stringB.toString().split("\\\\n\\\\s+");
                //String[] result2 = stringB.toString().split("[0-9]");
                for(String i : frequency)
                    System.out.println(i);
                bReader.close();
                reader.close();




            }

        }catch(Exception e) {
    }



    }
    
}
