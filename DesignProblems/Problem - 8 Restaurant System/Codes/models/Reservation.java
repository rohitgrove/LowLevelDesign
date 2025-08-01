package models;

import constants.ReservationStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import models.observer.Observer;
import models.observer.Subject;

public class Reservation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int reservationId;
    private Date reservationTime;
    private int totalCount;
    private ReservationStatus status;
    private String instructions;
    private Customer customer;
    private Table table;

    public ReservationStatus getStatus() {
        return this.status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
        // important hai -> jaise hi status change ho, waise hi sabhi ko
        // remionders/notifications send kardo
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update();
        }
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void addObserver(Observer obs) {
        if (!observers.contains(obs)) {
            observers.add(obs);
        }
    }

    public boolean updateReservation(int count) {
        return true;
    }

    public List<Observer> getObservers() {
        return this.observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public int getReservationId() {
        return this.reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Date getReservationTime() {
        return this.reservationTime;
    }

    public void setReservationTime(Date reservationTime) {
        this.reservationTime = reservationTime;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getInstructions() {
        return this.instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Table getTable() {
        return this.table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
}