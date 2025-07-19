public class WeatherStation {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Weather Station: New temperature is " + temperature);
    }

    public int getTemperature() {
        return temperature;
    }
}