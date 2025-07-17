public class Switch {
    private Light light;

    public Switch(Light light) {
        this.light = light;
    }

    public void pressOn() {
        light.turnOn();
    }

    public void pressOff() {
        light.turnOff();
    }
}
