public class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio turned off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("TV changed to channel " + channel);
    }
}
