package models;

import java.util.List;

public class CarRentalSystem {
    private String name;
    private List<CarRentalBranch> branches;
    private static CarRentalSystem system = null;

    public void addNewBranch(CarRentalBranch branch) {
        branches.add(branch);
    }

    synchronized public static CarRentalSystem getInstance() {
        if (system == null) {
            synchronized (CarRentalSystem.class) {
                if (system == null) {
                    system = new CarRentalSystem();
                }
            }
        }

        return system;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CarRentalBranch> getBranches() {
        return this.branches;
    }

    public void setBranches(List<CarRentalBranch> branches) {
        this.branches = branches;
    }
}