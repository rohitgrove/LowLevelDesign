public class PeakSeasonDecorator extends VehicleDecorator {
    private float additionalCharge;

    public PeakSeasonDecorator(Vehicle vehicle, float additionalCharge) {
        super(vehicle);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public float getPrice() {
        float basePrice = baseVehicle.getPrice();
        return basePrice + additionalCharge;
    }
}