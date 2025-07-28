package models;

public class HallPanel {
    private HallButton upButton;
    private HallButton downButton;

    public HallButton getUpButton() {
        return this.upButton;
    }

    public void setUpButton(HallButton upButton) {
        this.upButton = upButton;
    }

    public HallButton getDownButton() {
        return this.downButton;
    }

    public void setDownButton(HallButton downButton) {
        this.downButton = downButton;
    }
}