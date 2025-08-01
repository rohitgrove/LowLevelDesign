package models;

import java.util.List;

public class Menu {
    private int menuId;
    private String type;
    private List<MenuSection> sections;

    public boolean updateMenuSection(MenuSection section) {
        return true;
    }

    public int getMenuId() {
        return this.menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<MenuSection> getSections() {
        return this.sections;
    }

    public void setSections(List<MenuSection> sections) {
        this.sections = sections;
    }
}