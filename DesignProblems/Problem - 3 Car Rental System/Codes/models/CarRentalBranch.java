package models;

import datatypes.Address;
import java.util.List;

public abstract class CarRentalBranch {
    private String name;
    private Address address;
    private List<ParkingStall> stalls;

    public abstract Address getLocation();
}