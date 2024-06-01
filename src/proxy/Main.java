package proxy;

public class Main {
    public static void main(String[] args) {
        SecuredDoor securedDoor = new SecuredDoor(new LabDoor(), "123213");
        securedDoor.setInputPassword("hello");
        securedDoor.open();
        securedDoor.close();
        securedDoor.setInputPassword("123213");
        securedDoor.open();
    }
}
