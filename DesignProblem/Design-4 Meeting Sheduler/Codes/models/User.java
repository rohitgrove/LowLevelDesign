package models;

public class User {
    private String name;
    private String email;
    private int id;
    private Calendar userCalendar;


    public void respondToInvitation(Notification message) {}
    public void respondToMeeting() {}
    public void checkCalendar() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setCaleder(Calendar userCalendar) {
        this.userCalendar = userCalendar;
    }

    public Calendar getCalendar() {
        return this.userCalendar;
    }
}
