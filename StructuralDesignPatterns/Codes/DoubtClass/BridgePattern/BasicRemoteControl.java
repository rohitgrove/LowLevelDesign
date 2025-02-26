public class BasicRemoteControl extends RemoteControl {
    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOn();
    }

    @Override
    public void setChannel(int channel) {
        device.setChannel(channel);
    }
}
