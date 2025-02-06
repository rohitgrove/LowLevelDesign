import Models.IEngine;

public class Car {
    IVehicleFactory carFactory;
    IEngine engine;
    public Car(IVehicleFactory factory) {
        this.carFactory = factory;
    }

    public void driveCar() {
        this.engine = carFactory.createEngine();
        System.out.println("Milgyi gaadi, chill maro");
    }
}
