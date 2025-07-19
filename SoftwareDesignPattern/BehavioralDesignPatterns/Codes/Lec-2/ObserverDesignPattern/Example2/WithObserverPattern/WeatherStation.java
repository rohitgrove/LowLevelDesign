import java.util.ArrayList;
import java.util.List;

// Step 3: Concrete Subject (WeatherStation)
public class WeatherStation implements Subject {
    private int temperature;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Weather Station: Temperature updated to " + temperature);
        notifyObservers(); // Notify all observers when temperature changes
    }
}