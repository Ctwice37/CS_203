package baseDerived;

public class classC extends classB{

    int b;
    int c;

    public classC(int b, int c){
        this.b = b;
        this.c = c;
    }

    public classC(int x, int y, int z, int a, int b, int c) {
        super(x, y, z, a);
        this.b = b;
        this.c = c;
    }



    public void printC(){
        System.out.println("public print C calling public helper B: ");
        helperPrintB();
    }
}
