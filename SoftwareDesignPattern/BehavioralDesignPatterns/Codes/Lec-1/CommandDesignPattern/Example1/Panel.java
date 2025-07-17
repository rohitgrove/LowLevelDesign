public class Panel {
    Command[] commands = new Command[5];

    public Panel() {
    }

    public void setCommand(int index, Command cmd) {
        commands[index] = cmd;
    }

    public void liftSuspension() {
        commands[0].execute();
    }

    public void applyBreak() {
        commands[1].execute();
    }
}
