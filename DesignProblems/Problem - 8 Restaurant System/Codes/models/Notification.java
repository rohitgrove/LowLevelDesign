package models;

import java.util.Date;
import models.observer.Observer;

public class Notification implements Observer {
    private int notificationId;
    private Date creationTime;
    private String content;
    private Reservation reservation;

    public Notification(Reservation reservation) {
        this.reservation = reservation;
        // important
        this.reservation.addObserver(this);
    }

    public void sendNotification() {
    }

    public int getNotificationId() {
        return this.notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public Date getCreationTime() {
        return this.creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Reservation getReservation() {
        return this.reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public void update() {
        // agar mera status confirmed hua hai, toh hi notification send karo
        // if(reservation.getStatus() == ReservationStatus.CONFIRMED) {
        // System.out.println("Aapki Reservation confirm hogyi h dost");
        // }
        System.out.println("Notification send kardo");
    }
}
