package vehicle;

import constants.TruckType;

public class Truck extends Vehicle {
    private TruckType truckType;

    public TruckType getTruckType() {
        return truckType;
    }

    public void setTruckType(TruckType truckType) {
        this.truckType = truckType;
    }
}