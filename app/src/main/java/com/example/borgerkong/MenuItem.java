package com.example.borgerkong;


public class MenuItem {

    // unique identifier of a menu item
    private int itemID;
    //item name
    public String itemName;
    //item price
    public double itemPrice;
    //item description
    private String itemDescription;
    //Resource ID for item image
    private int imageDrawableID;

    public MenuItem(int itemID, String itemName, double itemPrice, String itemDescription, int imageDrawableID){
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.imageDrawableID = imageDrawableID;
    }


    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public int getImageDrawableID() {
        return imageDrawableID;
    }
}
