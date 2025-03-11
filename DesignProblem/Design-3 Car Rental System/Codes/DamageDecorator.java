public class DamageDecorator extends VehicleDecorator {
    private float fine;

    public DamageDecorator(Vehicle vehicle, float fine) {
        super(vehicle);
        this.fine = fine;
    }

    @Override
    public boolean returnVehicle() {
        // cal. fine
        float totalPrice = baseVehicle.getPrice() + fine;
        // set new price
        baseVehicle.setPrice(totalPrice);
        return baseVehicle.returnVehicle();
    }
}