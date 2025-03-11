public class DiscountDecorator extends VehicleDecorator {
    private float discountRate;

    public DiscountDecorator(Vehicle vehicle, float rate) {
        super(vehicle);
        this.discountRate = rate;
    }

    @Override
    public float getPrice() {
        float basePrice = baseVehicle.getPrice();
        return basePrice - (basePrice * discountRate);
    }
}