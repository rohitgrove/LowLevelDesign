// Step 3: Concrete Builder
public class SportsCarBuilder implements CarBuilder {
    private Car car;

    public SportsCarBuilder() {
        car = new Car();
    }

    // Step by step construction of the car
    @Override
    public void buildEngine() {
        car.setEngine("V8");
    }

    @Override
    public void buildWheels() {
        car.setWheels("Sports Alloy");
    }

    @Override
    public void buildSeats() {
        car.setSeats("Racing Seats");
    }

    @Override
    public void buildColor() {
        car.setColor("Red");
    }

    @Override
    public Car getCar() {
        return car;
    }
}