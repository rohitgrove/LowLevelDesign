package Models;

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

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
