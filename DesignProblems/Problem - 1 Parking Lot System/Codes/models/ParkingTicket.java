package models;

import Interface.Payment;
import Interface.Vehicle;
import java.util.Date;

public class ParkingTicket {
    private int ticketNo;
    private Date extryTimestamp;
    private Date exitTimestamp;
    private double amount;
    private boolean status;

    // iske alawa or k k chahoye hoga
    private Vehicle vehicle;
    private Payment payment;
    private Entrance entrance;
    private Exit exit;

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public Date getExtryTimestamp() {
        return extryTimestamp;
    }

    public void setExtryTimestamp(Date extryTimestamp) {
        this.extryTimestamp = extryTimestamp;
    }

    public Date getExitTimestamp() {
        return exitTimestamp;
    }

    public void setExitTimestamp(Date exitTimestamp) {
        this.exitTimestamp = exitTimestamp;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Entrance getEntrance() {
        return entrance;
    }

    public void setEntrance(Entrance entrance) {
        this.entrance = entrance;
    }

    public Exit getExit() {
        return exit;
    }

    public void setExit(Exit exit) {
        this.exit = exit;
    }
}
