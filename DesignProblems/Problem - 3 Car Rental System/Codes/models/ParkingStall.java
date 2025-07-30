package models;

import java.util.List;

public class ParkingStall {
    int stallId;
    String locationIdentifier;
    List<Integer> vehicles; // vehicle id

    public int getStallId() {
        return this.stallId;
    }

    public void setStallId(int stallId) {
        this.stallId = stallId;
    }

    public String getLocationIdentifier() {
        return this.locationIdentifier;
    }

    public void setLocationIdentifier(String locationIdentifier) {
        this.locationIdentifier = locationIdentifier;
    }

    public List<Integer> getVehicles() {
        return this.vehicles;
    }

    public void setVehicles(List<Integer> vehicles) {
        this.vehicles = vehicles;
    }
}