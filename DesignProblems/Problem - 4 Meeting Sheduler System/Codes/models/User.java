package models;

public class User {
    private String name;
    private String email;
    private int id;
    private Calendar userCalendar;

    public void respondToInvitation(Notification message) {
    }

    public void respondToMeeting() {
    }

    public void checkCalendar() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getUserCalendar() {
        return this.userCalendar;
    }

    public void setUserCalendar(Calendar userCalendar) {
        this.userCalendar = userCalendar;
    }
}