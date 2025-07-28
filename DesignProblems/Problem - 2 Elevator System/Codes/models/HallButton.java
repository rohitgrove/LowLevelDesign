package models;

import constants.DirectionStatus;

public class HallButton extends Button {
    private DirectionStatus DirectionButton;

    @Override
    public void press() {
        // add your custom logic here
    }

    @Override
    public boolean isPressed() {
        // add your custom logic here
        return false;
    }

    public DirectionStatus getDirectionButton() {
        return DirectionButton;
    }

    public void setDirectionButton(DirectionStatus DirectionButton) {
        this.DirectionButton = DirectionButton;
    }
}
