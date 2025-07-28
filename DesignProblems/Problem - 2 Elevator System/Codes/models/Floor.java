package models;

import java.util.List;

public class Floor {
    private int id;
    private List<HallPanel> floorPanel;
    private List<Display> floorDisplay;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<HallPanel> getFloorPanel() {
        return this.floorPanel;
    }

    public void setFloorPanel(List<HallPanel> floorPanel) {
        this.floorPanel = floorPanel;
    }

    public List<Display> getFloorDisplay() {
        return this.floorDisplay;
    }

    public void setFloorDisplay(List<Display> floorDisplay) {
        this.floorDisplay = floorDisplay;
    }
}