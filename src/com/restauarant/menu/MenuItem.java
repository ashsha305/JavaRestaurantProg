package com.restauarant.menu;

public class MenuItem {
    private String item;
    private String code;

    public MenuItem() {
        this.item = "Null(Item)";
        this.code = "Null(Code)";
    }

    public MenuItem(String item, String code) {
        this.item = item;
        this.code = code;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static void main(String args[]) {
        Item item1 = new Item("Item","Code");
        System.out.println("Item:" + item1.getItem());
        System.out.println("Item:" + item1.getCode());
    }
}