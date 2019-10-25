package com.example.borgerkong;

public class CheckOutItem {

    public String itemName;
    public double itemPrice;
    public int itemQuantity;
    private int imageDrawableID;

    public CheckOutItem(int checkOutID, String itemName, double itemPrice,
                        int itemQuantity, int imageDrawableID) {
        CheckOut.checkOutID = checkOutID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.imageDrawableID = imageDrawableID;
    }

    public String getItemName() {
        return itemName;
    }
    public int getImageDrawableID() {
        return imageDrawableID;
    }
    public int getItemQuantity(){
        return itemQuantity;
    }
}
