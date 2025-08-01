package Models;

import java.util.List;

public class Rack {
    private int id;
    private List<Slot> slots;

    public boolean addProduct(Product product, int slotId) {
        //dummy nature
        return true;
    }
    public boolean removeProduct(Product product, int slotId) {
        //dummy nature
        return true;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Slot> getSlots() {
        return this.slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }
}