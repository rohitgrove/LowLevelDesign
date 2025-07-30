package models;

// File: Equipment.java
public class Equipment {
    private int equipmentId;
    private String name;
    private String description;
    private int price;

    // Constructor
    public Equipment(int equipmentId, String name, String description, int price) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // Getters
    public int getEquipmentId() {
        return equipmentId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    // Setter
    public void setPrice(int price) {
        this.price = price;
    }
}
