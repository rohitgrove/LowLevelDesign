package models;

public class Branch {
    private String name;
    private int branchId;
    private String location;
    private TableChart tableChart;
    private Menu menu;
    private Kitchen kitchen;

    public boolean addTableChart(TableChart chart) {
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public TableChart getTableChart() {
        return tableChart;
    }

    public void setTableChart(TableChart tableChart) {
        this.tableChart = tableChart;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
