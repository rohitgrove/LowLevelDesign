package models;

import Interface.ParkingSpot;
import Interface.Vehicle;
import java.util.HashMap;

public class ParkingLotSystem {
    private int id;
    private String name;
    private String address;
    private final int MAX_CAPACTIY = 40000;
    private HashMap<String, Entrance> entrances;
    private HashMap<String, Exit> exits;
    private ParkingRate parkingRate;
    private HashMap<String, DisplayBoard> displayBoards;
    private HashMap<String, ParkingTicket> parkingTickets;
    private HashMap<String, ParkingSpot> parkingSpots;

    // instance
    private static ParkingLotSystem parkingLot = null;

    // singleton design pattern
    private ParkingLotSystem() {
        // add your impl here
    }

    // getInstance
    public static ParkingLotSystem getInstance() {
        // TODO: will this work in multi-threaded env
        if (parkingLot == null) {
            parkingLot = new ParkingLotSystem();
        }
        return parkingLot;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle) {
        // add your impl here
        return null;
    }

    public boolean isFull() {
        // add ur logic here
        return false;
    }

    public boolean addEntrance(Entrance entrance) {
        return false;
    }

    public boolean addExit(Exit exit) {
        return false;
    }
    // add more methods here

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMAX_CAPACTIY() {
        return MAX_CAPACTIY;
    }

    public ParkingRate getParkingRate() {
        return parkingRate;
    }

    public void setParkingRate(ParkingRate parkingRate) {
        this.parkingRate = parkingRate;
    }

    public HashMap<String, Entrance> getEntrances() {
        return entrances;
    }

    public void setEntrances(HashMap<String, Entrance> entrances) {
        this.entrances = entrances;
    }

    public HashMap<String, Exit> getExits() {
        return exits;
    }

    public void setExits(HashMap<String, Exit> exits) {
        this.exits = exits;
    }

    public HashMap<String, DisplayBoard> getDisplayBoards() {
        return displayBoards;
    }

    public void setDisplayBoards(HashMap<String, DisplayBoard> displayBoards) {
        this.displayBoards = displayBoards;
    }

    public HashMap<String, ParkingTicket> getParkingTickets() {
        return parkingTickets;
    }

    public void setParkingTickets(HashMap<String, ParkingTicket> parkingTickets) {
        this.parkingTickets = parkingTickets;
    }

    public HashMap<String, ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(HashMap<String, ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
}
