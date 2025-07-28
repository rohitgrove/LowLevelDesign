package models;

import java.util.List;

public class ElevatorPanel {
    private List<ElevatorButton> floorBtns;
    private ElevatorButton openDoorBtn;
    private ElevatorButton closeDoorBtn;

    public List<ElevatorButton> getFloorBtns() {
        return this.floorBtns;
    }

    public void setFloorBtns(List<ElevatorButton> floorBtns) {
        this.floorBtns = floorBtns;
    }

    public ElevatorButton getOpenDoorBtn() {
        return this.openDoorBtn;
    }

    public void setOpenDoorBtn(ElevatorButton openDoorBtn) {
        this.openDoorBtn = openDoorBtn;
    }

    public ElevatorButton getCloseDoorBtn() {
        return this.closeDoorBtn;
    }

    public void setCloseDoorBtn(ElevatorButton closeDoorBtn) {
        this.closeDoorBtn = closeDoorBtn;
    }
}