package command;

// Invoker
// 用接口来传递行为。
// 如果我有一个遥控器，我希望可以给上面的按钮注入不同的功能（命令模式）
// Invoker和receiver并不之间耦合，而是通过一个接口作为桥梁。
public class RemoteControl {
    void click(Command command) {
        command.execute();
    }
}
