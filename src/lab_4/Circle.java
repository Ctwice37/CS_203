package lab_4;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;


    }

    public static void main(String[] args) {
        Circle c = new Circle(4);
        Rectangle r = new Rectangle(2, 2);

        ShowArea(c);
        ShowArea(r);
    }

        public static void ShowArea(Shape s){
            double area = s.area();
            System.out.println("The area of the shape is: " + area);

    }
}
