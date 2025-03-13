package models;

import java.util.List;

public class MenuSection {
    private int sectionId;
    private String title;
    private List<MenuItem> items;

    public boolean updateMenuItem(MenuItem item) {
        items.add(item);
        return true;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }
}
