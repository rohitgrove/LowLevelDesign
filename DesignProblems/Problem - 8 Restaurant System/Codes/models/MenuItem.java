package models;

public class MenuItem {
    private int id;
    private String title;
    private String description;
    private float price;

    public MenuItem(int id, String title, String desc, float price) {
        this.id = id;
        this.title = title;
        this.description = desc;
        this.price = price;
    }

    public boolean updateItemInfo(String title, String desc, int price) {
        return true;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}