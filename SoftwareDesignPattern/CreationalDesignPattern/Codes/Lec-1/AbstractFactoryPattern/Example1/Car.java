import Models.IEngine;

public class Car {
    IEngine engine;
    IVehicleFactory carFactory;

    public Car(IVehicleFactory factory) {
        this.carFactory = factory;
    }

    public void driveCar() {
        engine = carFactory.createEngine();
        System.out.println("mil gyi gaadi, chill maaro");
    }
}