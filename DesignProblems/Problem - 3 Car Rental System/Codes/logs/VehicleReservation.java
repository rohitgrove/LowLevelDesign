package logs;

import constants.ReservationStatus;
import java.security.Provider.Service;
import java.sql.Date;
import java.util.List;
import models.Equipment;

public class VehicleReservation {
private int reservationId;
    private String customerId;
    private String vehicleId;
    private Date creationDate;
    private ReservationStatus status;
    private Date dueDate;
    private Date returnDate;
    private String pickupLocation;
    private String returnLocation;

    private List<Equipment> equipments;
    private List<Service> services;

    public static VehicleReservation getReservationDetails() { return new VehicleReservation(); }
    public boolean addEquipment() { return true; }
    public boolean addService() { return true; }
}
