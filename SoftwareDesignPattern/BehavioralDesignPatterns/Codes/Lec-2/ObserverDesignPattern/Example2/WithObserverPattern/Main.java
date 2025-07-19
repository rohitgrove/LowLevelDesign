// Step 5: Client Code
public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        PhoneDisplay phone1 = new PhoneDisplay("Phone 1");
        PhoneDisplay phone2 = new PhoneDisplay("Phone 2");

        station.addObserver(phone1);
        station.addObserver(phone2);

        station.setTemperature(30); // Notifies all registered observers
        station.setTemperature(35); // Notifies all observers again
    }
}

/*
 * OUTPUT:
 * Weather Station: Temperature updated to 30
 * Phone 1 Display: Temperature updated to 30
 * Phone 2 Display: Temperature updated to 30
 * Weather Station: Temperature updated to 35
 * Phone 1 Display: Temperature updated to 35
 * Phone 2 Display: Temperature updated to 35
 */