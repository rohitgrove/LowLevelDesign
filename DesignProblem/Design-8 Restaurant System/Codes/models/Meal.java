package models;

import java.util.List;

public class Meal {
    private int mealId;
    private List<MealItem> items;

    public boolean addMealItem(MealItem item) {
        items.add(item);
        return true;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public List<MealItem> getItems() {
        return items;
    }

    public void setItems(List<MealItem> items) {
        this.items = items;
    }
}
