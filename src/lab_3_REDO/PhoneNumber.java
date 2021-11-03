package lab_3_REDO;

public class PhoneNumber {
    private int type;
    private int number;

    public PhoneNumber(){
        type = 0;
        number = 111;
    }

    public PhoneNumber(int type, int number) {
        this.type = type;
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
