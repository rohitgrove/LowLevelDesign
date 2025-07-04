// Step 5: Client Code
public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new SportsCarBuilder();
        Director director = new Director(builder);

        Car car = director.constructCar(true);
        car.showDetails(); // Output: Car with Engine: V8, Wheels: Sports Alloy, Seats: Racing Seats, Color: Red
    }
}
