package models;

import java.util.List;

public class Building {
    private List<Floor> floorList;
    private List<Elevator> elevatorList;

    private static Building buildingInstance = null;

    private Building() {

    }

    public static Building getInstance() {
        if (buildingInstance == null) {
            buildingInstance = new Building();
        }
        return buildingInstance;
    }

    public List<Floor> getFloorList() {
        return this.floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public List<Elevator> getElevatorList() {
        return this.elevatorList;
    }

    public void setElevatorList(List<Elevator> elevatorList) {
        this.elevatorList = elevatorList;
    }
}