package models;

import constants.DirectionStatus;

public class Display {
    private int floorNumber;
    private int capacity;
    private DirectionStatus direction;

    public int getFloorNumber() {
        return this.floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public DirectionStatus getDirection() {
        return this.direction;
    }

    public void setDirection(DirectionStatus direction) {
        this.direction = direction;
    }
}