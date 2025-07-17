// Step 5: Client
public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        Switch switchBtn = new Switch();

        switchBtn.setCommand(lightOn);
        switchBtn.pressButton(); // Light is ON

        switchBtn.setCommand(lightOff);
        switchBtn.pressButton(); // Light is OFF
    }
}
