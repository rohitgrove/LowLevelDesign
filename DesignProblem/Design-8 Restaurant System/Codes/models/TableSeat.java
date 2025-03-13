package models;

import constants.SeatType;

public class TableSeat {
    private int seatNumber;
    private SeatType type;

    public boolean updateSeatType(SeatType type) {
        return true;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public SeatType getType() {
        return type;
    }

    public void setType(SeatType type) {
        this.type = type;
    }
}
