public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned off.");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("TV changed to channel " + channel);
    }
}
