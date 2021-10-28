package inClassScratchPad;

public class arrayTest {
    int a;
    int b;
    int c;
    int d;

    public arrayTest(){
        this(5);
    }

    public arrayTest(int a) {
        this(a, 5);
    }

    public arrayTest(int a, int b){
        this.a = a;
        this.b = b;

        System.out.println("2 parameter constructor");

    }




    public static void main(String[] args) {
        arrayTest a = new arrayTest();
    }

    }


