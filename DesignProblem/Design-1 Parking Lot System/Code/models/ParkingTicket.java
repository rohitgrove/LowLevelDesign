package models;

import Interface.Payment;
import Interface.Vehicle;
import constants.TicketStatus;
import java.util.Date;

public class ParkingTicket {
    private int ticketNo;
    private Date extryTimestamp;
    private Date exitTimestamp;
    private double amount;
    private TicketStatus status;

    // iske alawa or k k chahoye hoga
    private Vehicle vehicle;
    private Payment payment;
    private Entrance entrance;
    private Exit exit;
}
