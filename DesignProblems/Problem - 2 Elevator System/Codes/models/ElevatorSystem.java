package models;

public class ElevatorSystem {
    private Building building;
    private static ElevatorSystem elevatorSystemInstance = null;

    private ElevatorSystem() {

    }

    public synchronized static ElevatorSystem getInstance() {
        if (elevatorSystemInstance == null) {
            elevatorSystemInstance = new ElevatorSystem();
        }
        return elevatorSystemInstance;
    }

    public void monitoring() {
        // TODO: add your custom logic here
    }

    public void dispatcherAlgo() {
        // TODO: add your custom logic here
    }

    // TODO: add your utilities or Functions that a elevatorSystem should have,
    // below

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }
}
