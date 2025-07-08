public class Car {
    private String engine;
    private String wheels;
    private String seats;
    private String color;

    // Construct a car with engine, wheels and seats
    public Car(String engine, String wheels, String seats, String color) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.color = color;
    }

    public void showDetails() {
        System.out.println("Car with Engine: " + engine + ", Wheels: " + wheels + ", Seats: " + seats + ", Color: " + color);
    }
}
