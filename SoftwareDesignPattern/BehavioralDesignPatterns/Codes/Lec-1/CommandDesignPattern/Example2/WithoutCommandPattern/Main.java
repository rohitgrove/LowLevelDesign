public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Switch switchBtn = new Switch(light);

        switchBtn.pressOn(); // Light is ON
        switchBtn.pressOff(); // Light is OFF
    }
}
