public class Adapter implements ICar {
    public HotAirBallon hotAirBallon;

    public Adapter(HotAirBallon hotAirBallon) {
        this.hotAirBallon = hotAirBallon;
    }

    @Override
    public void start() {
        String gasToBeUsed = hotAirBallon.getGasUsed();
        hotAirBallon.start(gasToBeUsed);
    }
}
