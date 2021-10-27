package baseDerived;

public class classB extends classA{

    int a;

    public classB(int a){
        this.a = a;
    }
    public classB(){};

    public classB(int x, int y, int z, int a) {
        super(x, y, z);
        this.a = a;

    }


  private void printB(){
      System.out.println("public HelperPrint B calling private Print B");
      System.out.println("Private Print B calling public helper A");
      helperPrintA();

    }
    public void helperPrintB(){

      printB();
    }

}
