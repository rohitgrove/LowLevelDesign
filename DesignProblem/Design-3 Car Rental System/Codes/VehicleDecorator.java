public class VehicleDecorator extends Vehicle {
    protected Vehicle baseVehicle;

    public VehicleDecorator(Vehicle vehicle) {
        this.baseVehicle = vehicle;
    }

    @Override
    public boolean reserveVehicle() {
        return baseVehicle.reserveVehicle();
    }

    @Override
    public boolean returnVehicle() {
        return baseVehicle.returnVehicle();
    }
}
