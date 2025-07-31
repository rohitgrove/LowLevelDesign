package models;

import java.util.List;

public class MeetingSchedulingSystem {
    private MeetingScheduler scheduler;
    private List<User> users;
    private List<MeetingRoom> rooms;

    private static MeetingSchedulingSystem schedulingSystemInstance = null;

    private MeetingSchedulingSystem() {
    }

    public static MeetingSchedulingSystem getInstance() {
        if (schedulingSystemInstance == null) {
            schedulingSystemInstance = new MeetingSchedulingSystem();
        }
        return schedulingSystemInstance;
    }

    public void addRoom() {

    }

    public void removeRoom() {

    }

    public void scheduleMeeting(List<User> user, Interval interval) {
        // request ko delegate karre ho
        scheduler.scheduleMeeting(user, interval);
    }

    public void cancelMeeting() {

    }

    public MeetingScheduler getScheduler() {
        return this.scheduler;
    }

    public void setScheduler(MeetingScheduler scheduler) {
        this.scheduler = scheduler;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<MeetingRoom> getRooms() {
        return this.rooms;
    }

    public void setRooms(List<MeetingRoom> rooms) {
        this.rooms = rooms;
    }
}
