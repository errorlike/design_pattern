package command;
// 封装一个命令到对象中便于传递。
// 具体命令依赖于实际被控制者。
public class TurnOff implements Command {
    protected Bulb bulb;

    public TurnOff(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.turnOff();
    }

    @Override
    public void undo() {
        bulb.turnOn();
    }

    @Override
    public void redo() {
        execute();
    }

}
