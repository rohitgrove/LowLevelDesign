package decorator;

import vehicle.Vehicle;

public class DamageDecorator extends VehicleDecorator {
    private float fine;

    public DamageDecorator(Vehicle vehicle, float fine) {
        super(vehicle);
        this.fine = fine;
    }

    @Override
    public boolean returnVehicle() {
        float totalPrice = baseVehicle.getPrice() + fine;
        baseVehicle.setPrice(totalPrice);
        return baseVehicle.returnVehicle();
    }

    public float getFine() {
        return fine;
    }

    public void setFine(float fine) {
        this.fine = fine;
    }
}