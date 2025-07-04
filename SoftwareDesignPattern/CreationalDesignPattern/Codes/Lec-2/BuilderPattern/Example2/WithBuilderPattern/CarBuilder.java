// Step 2: Builder Interface
public interface CarBuilder {
    public void buildEngine();

    public void buildWheels();

    public void buildSeats();

    public void buildColor();

    public Car getCar();
}