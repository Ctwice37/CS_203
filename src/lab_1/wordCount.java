package lab_1;

import java.util.StringTokenizer;

public class wordCount {

    private int count;

    public int counter(String s){
        initialize();
        StringTokenizer st1 = new StringTokenizer(s);
        while (st1.hasMoreTokens()) {
        String ss = st1.nextToken();
        if(ss.charAt(0) == 'A' || ss.charAt(0) == 'a')
            decrement();
        else
            increment();

    }return count;

    }
    public void decrement(){
        if(this.count > 0)
            this.count--;
    }
    public void increment(){
        this.count++;

    }
    public void initialize(){
        this.count = 0;
    }



    public static void main(String[] args) {

        wordCount w  = new wordCount();

        System.out.println(w.counter("The a in in in in"));

        System.out.println((float)56/100);

    }
}