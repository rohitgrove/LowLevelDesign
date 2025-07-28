package models;

import constants.DoorStatus;

public class Door {
    private DoorStatus status;

    public DoorStatus getStatus() {
        return status;
    }

    public void setStatus(DoorStatus status) {
        this.status = status;
    }
}
