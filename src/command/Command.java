package command;

// 一个命令的基本操作
public interface Command {
    void execute();

    void undo();

    void redo();
}
