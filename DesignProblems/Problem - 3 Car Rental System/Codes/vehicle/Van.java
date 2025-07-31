package vehicle;

import constants.VanType;

public class Van extends Vehicle {
    private VanType vanType;

    public VanType getVanType() {
        return vanType;
    }

    public void setVanType(VanType vanType) {
        this.vanType = vanType;
    }
}
