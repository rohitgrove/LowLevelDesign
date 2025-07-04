// Client Code
public class Main {
    public static void main(String[] args) {
        Car car = new Car("V6", "MRF", "Leather", "Red");
        car.showDetails(); // Car with Engine: V6, Wheels: MRF, Seats: Leather, Color: Red
    }
}

/*
Problems:
- The constructor becomes difficult to manage with more parameters.
- Hard to read and maintain the code when object creation logic changes.
- Object creation logic is tightly coupled with the client code.
*/