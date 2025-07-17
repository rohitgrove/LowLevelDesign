public class Main {
    public static void main(String[] args) {
        // cmdPattern
        // setting up the system
        BreakMechanism breakMechanism = new BreakMechanism();
        AirSuspensionMechanism airSuspensionMechanism = new AirSuspensionMechanism();

        EngageBreakCommand breakCmd = new EngageBreakCommand(breakMechanism);
        AirSuspensionCommand airCmd = new AirSuspensionCommand(airSuspensionMechanism);

        Panel btnPanel = new Panel();

        btnPanel.setCommand(0, airCmd);
        btnPanel.setCommand(1, breakCmd);

        ///try different buttons
        // btnPanel.liftSuspension();
        btnPanel.applyBreak();
    }
}