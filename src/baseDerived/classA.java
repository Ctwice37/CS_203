package baseDerived;

public class classA {
    private int x;
    private int y;
    private int z;

    public classA() {
    }

    public classA(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;



    }


    private void printA(){
        System.out.print(y + z);
    }

    public void helperPrintA(){
        System.out.println("public helper A calling private print A");
        System.out.print("private print A adding y + z = ");
        printA();
    }
}
