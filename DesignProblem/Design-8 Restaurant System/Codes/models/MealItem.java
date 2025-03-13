package models;

public class MealItem {
    private int itemId;
    private int quantity;

    public boolean updateQuantity(int count) {
        return true;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
