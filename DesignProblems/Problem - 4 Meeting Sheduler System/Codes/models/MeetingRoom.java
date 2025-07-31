package models;

import java.util.List;

public class MeetingRoom {
    private int id;
    private int capacity;
    private boolean isAvailable;
    private List<Interval> bookedIntervals;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isIsAvailable() {
        return this.isAvailable;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public List<Interval> getBookedIntervals() {
        return this.bookedIntervals;
    }

    public void setBookedIntervals(List<Interval> bookedIntervals) {
        this.bookedIntervals = bookedIntervals;
    }
}