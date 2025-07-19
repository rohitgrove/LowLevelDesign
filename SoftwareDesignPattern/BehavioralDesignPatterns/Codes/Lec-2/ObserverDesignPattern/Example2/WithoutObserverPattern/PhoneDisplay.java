public class PhoneDisplay {
    private WeatherStation station;

    public PhoneDisplay(WeatherStation station) {
        System.out.println("Phone Display: Temperature updated to " + station.getTemperature());
    }

    public void update() {
        System.out.println("Phone Display: Temperature updated to " + station.getTemperature());
    }
}