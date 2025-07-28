package models;

import constants.ElevatorStatus;

public class Elevator {
    private int id;
    private Door elevatorDoor;
    private Display elevatorDisplay;
    private ElevatorStatus elevatorState;
    private ElevatorPanel elevatorPanel;
    // TODO: mark the below property as constant - 650KG
    private final int maxCapacity = 650;

    private void move() {

    }

    private void stop() {

    }

    private void openDoor() {

    }

    private void closeDoor() {

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Door getElevatorDoor() {
        return this.elevatorDoor;
    }

    public void setElevatorDoor(Door elevatorDoor) {
        this.elevatorDoor = elevatorDoor;
    }

    public Display getElevatorDisplay() {
        return this.elevatorDisplay;
    }

    public void setElevatorDisplay(Display elevatorDisplay) {
        this.elevatorDisplay = elevatorDisplay;
    }

    public ElevatorStatus getElevatorState() {
        return this.elevatorState;
    }

    public void setElevatorState(ElevatorStatus elevatorState) {
        this.elevatorState = elevatorState;
    }

    public ElevatorPanel getElevatorPanel() {
        return this.elevatorPanel;
    }

    public void setElevatorPanel(ElevatorPanel elevatorPanel) {
        this.elevatorPanel = elevatorPanel;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }
}
