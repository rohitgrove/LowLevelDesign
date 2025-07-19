public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        new PhoneDisplay(station);

        station.setTemperature(30); // Only updates station, not display
    }
}
