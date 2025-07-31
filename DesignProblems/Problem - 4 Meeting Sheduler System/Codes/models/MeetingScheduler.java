package models;

import java.util.List;

public class MeetingScheduler {
    private Calendar calendar;
    private List<MeetingRoom> rooms;
    private User organiser;

    private static MeetingScheduler schedulerInstance = null;

    private MeetingScheduler() {
    }

    public static MeetingScheduler getInstance() {
        if (schedulerInstance == null) {
            schedulerInstance = new MeetingScheduler();
        }
        return schedulerInstance;
    }

    public boolean scheduleMeeting(List<User> user, Interval interval) {
        // dummy
        return true;
    }

    public boolean cancelMeeting(List<User> user, Interval interval) {
        // dummy
        return true;
    }

    public boolean bookRoom(MeetingRoom room, int numberOfPerson, Interval interval) {
        // dummy
        return true;
    }

    public boolean releaseRoom(MeetingRoom room, Interval interval) {
        // dummy
        return true;
    }

    public Calendar getCalendar() {
        return this.calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public List<MeetingRoom> getRooms() {
        return this.rooms;
    }

    public void setRooms(List<MeetingRoom> rooms) {
        this.rooms = rooms;
    }

    public User getOrganiser() {
        return this.organiser;
    }

    public void setOrganiser(User organiser) {
        this.organiser = organiser;
    }
}
