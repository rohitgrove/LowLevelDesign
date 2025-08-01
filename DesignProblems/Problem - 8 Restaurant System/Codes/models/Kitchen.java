package models;

import java.util.List;

public class Kitchen {
    private int kitchenId;
    private List<Chef> chefs;

    public boolean addChef(Chef chef) {
        return true;
    }

    public int getKitchenId() {
        return this.kitchenId;
    }

    public void setKitchenId(int kitchenId) {
        this.kitchenId = kitchenId;
    }

    public List<Chef> getChefs() {
        return this.chefs;
    }

    public void setChefs(List<Chef> chefs) {
        this.chefs = chefs;
    }
}