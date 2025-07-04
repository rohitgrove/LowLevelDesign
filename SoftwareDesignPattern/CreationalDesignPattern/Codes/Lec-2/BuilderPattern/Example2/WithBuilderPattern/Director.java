// Step 4: Director
public class Director {
    private CarBuilder builder;

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    // Method to construct the car
    public Car constructCar(boolean wantColor) {
        if (wantColor) {
            builder.buildColor();
        }
        builder.buildEngine();
        builder.buildWheels();
        builder.buildSeats();
        return builder.getCar();
    }
}
