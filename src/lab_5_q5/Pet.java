package lab_5_q5;

public class Pet {
    private String name;
    private char type;

    public Pet(String name, char type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
