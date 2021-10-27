package lab_1;

public class cat {
    private static final String DEFAULT_NAME = "No name";
    private static final int DEFAULT_HGT = 6;
    private static final double DEFAULT_WGT = 10.0;





    private String name;
    private int height;
    private double weight;

    public cat(){
        this.name = DEFAULT_NAME;
        this.height = DEFAULT_HGT;
        this.weight = DEFAULT_WGT;
    }
    public cat(String name){
        this.name = name;
        this.weight = DEFAULT_WGT;
    }
    public cat(String name, int height) {
        this.name = name;
        this.height = height;


    }
    public cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    public cat(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
