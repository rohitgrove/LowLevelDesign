// Step 2: Base Class for Cars
public abstract class Car implements Prototype {
    String color;
    int wheels;
    int velocity;

    public Car(String color, int wheels, int velocity) {
        this.color = color;
        this.wheels = wheels;
        this.velocity = velocity;
    }

    // Implement clone method
    @Override
    public abstract Car clone();

    // Implement setEngine method
    @Override
    public abstract void setEngine(CarEngine carEngine);

    // Implement setModel method
    @Override
    public abstract void setModel(int model);
}
