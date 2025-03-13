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

    @Override
    public void update() {
        // agar mera status confirmed hua hai, toh hi notification send karo
        // if(reservation.getStatus() == ReservationStatus.CONFIRMED) {
        // System.out.println("Aapki Reservation confirm hogyi h dost");
        // }
        System.out.println("Notification send kardo");
    }

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
