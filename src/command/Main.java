package command;

public class Main {
    //这里负责组装。
    public static void main(String[] args) {
        Bulb bulb = new Bulb();
        new TurnOff(bulb);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.click(new TurnOn(bulb));
        remoteControl.click(new TurnOff(bulb));
    }
}
