package proxy;

public class SecuredDoor implements Door {
    private final Door door;
    private final String password;
    private String inputPassword = "";

    public SecuredDoor(Door door, String password) {
        this.door = door;
        this.password = password;
    }

    public void setInputPassword(String inputPassword) {
        this.inputPassword = inputPassword;
    }

    public boolean authenticate() {
        if (password == inputPassword) {
            return true;
        }
        return false;
    }

    @Override
    public void open() {
        if (authenticate()) {
            System.out.println("可以进入");
            door.open();
        } else {
            System.out.println("无法进入");
        }
    }
    @Override
    public void close() {
        door.close();
    }

}
