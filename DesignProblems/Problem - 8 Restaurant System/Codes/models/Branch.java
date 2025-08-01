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
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBranchId() {
        return this.branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public TableChart getTableChart() {
        return this.tableChart;
    }

    public void setTableChart(TableChart tableChart) {
        this.tableChart = tableChart;
    }

    public Menu getMenu() {
        return this.menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Kitchen getKitchen() {
        return this.kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
}