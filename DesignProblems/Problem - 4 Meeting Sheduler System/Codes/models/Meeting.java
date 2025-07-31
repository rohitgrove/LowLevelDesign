package models;

import java.util.List;

public class Meeting {
    private int id;
    private MeetingRoom room;
    private String subject;
    private Interval interval;
    private List<User> attendees;
    private User sender;

    public void addInMeeting(List<User> attendees) {

    }

    public void removeFromMeeting(User user) {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MeetingRoom getRoom() {
        return this.room;
    }

    public void setRoom(MeetingRoom room) {
        this.room = room;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Interval getInterval() {
        return this.interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    public List<User> getAttendees() {
        return this.attendees;
    }

    public void setAttendees(List<User> attendees) {
        this.attendees = attendees;
    }

    public User getSender() {
        return this.sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }
}