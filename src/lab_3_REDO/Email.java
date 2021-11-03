package lab_3_REDO;

public class Email {
    private int type;
    private String emailAddress;

    public Email() {
        type = 0;
        emailAddress = "this@address.com";
    }

    public Email(int type, String emailAddress) {
        this.type = type;
        this.emailAddress = emailAddress;
    }
}
