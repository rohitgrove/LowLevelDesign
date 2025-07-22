public class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio turned off.");
    }

    @Override
    public void setChannel(int channel) {
        // Radio might not use numerical channels like TV.
        System.out.println("Radio changed to station " + channel);
    }
}