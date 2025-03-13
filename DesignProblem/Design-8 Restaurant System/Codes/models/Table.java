package models;
import constants.TableStatus;
import java.util.List;

public class Table {
    private int tableId;
    private TableStatus status;
    private int maxCapacity;
    private int location;
    private List<TableSeat> seats;

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public TableStatus getStatus() {
        return status;
    }

    public void setStatus(TableStatus status) {
        this.status = status;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public List<TableSeat> getSeats() {
        return seats;
    }

    public void setSeats(List<TableSeat> seats) {
        this.seats = seats;
    }
}
