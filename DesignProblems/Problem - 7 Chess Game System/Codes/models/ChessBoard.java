package models;

import java.util.Date;

public class ChessBoard {

    private Box[][] boxes;
    private int id;
    private Date creationTime;

    public void updateBoard() {

    }

    public void resetBoard() {

    }

    public Box[][] getCurrentStatus() {
        return boxes;
    }

    public void setBoxes(Box[][] boxes) {
        this.boxes = boxes;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreationTime() {
        return this.creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
}