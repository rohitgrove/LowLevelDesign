package models;

import java.util.List;

public class TableChart {
    private int tableChartId;
    private List<Integer> availableTables;
    private List<Integer> reservedTables;

    public void printTableChartInfo() {}

    public List<Integer> getAvailableTables() {
        return availableTables;
    }

    public void setAvailableTables(List<Integer> availableTables) {
        this.availableTables = availableTables;
    }

    public List<Integer> getReservedTables() {
        return reservedTables;
    }

    public void setReservedTables(List<Integer> reservedTables) {
        this.reservedTables = reservedTables;
    }

    public int getTableChartId() {
        return tableChartId;
    }

    public void setTableChartId(int tableChartId) {
        this.tableChartId = tableChartId;
    }
}
