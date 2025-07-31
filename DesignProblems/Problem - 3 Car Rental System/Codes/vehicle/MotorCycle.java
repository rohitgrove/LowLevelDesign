package vehicle;

import constants.MotorcycleType;

public class MotorCycle extends Vehicle {
    private MotorcycleType motorcycleType;

    public MotorcycleType getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(MotorcycleType motorcycleType) {
        this.motorcycleType = motorcycleType;
    }
}