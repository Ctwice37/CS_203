package lab_3;

public class phoneNumber {
    int type;
    int number;


    public phoneNumber(){
        type = 0;
        number = 111111;
    }
    public phoneNumber(int type, int number) {
        this.type = type;
        this.number = number;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "phoneNumber{" +
                "type=" + type +
                ", number=" + number +
                '}';
    }
}
