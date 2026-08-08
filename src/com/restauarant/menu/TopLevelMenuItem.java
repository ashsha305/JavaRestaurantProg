package com.restaurant.menu;

public class TopLevelMenuItem {
    private String name;
    private String code;
    private MenuItem[] menuItems;
    public TopLevelMenuItem(String name,String code,MenuItem[] menuItems ) {
        this.name = name;
        this.code = code;
        this.menuItems = menuItems;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public TopLevelMenuItem(){
    
    }
}
