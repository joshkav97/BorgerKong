package com.example.borgerkong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CheckOut {

    public static double orderTotal = 0;
    public static int checkOutID = 1;

    public static ArrayList<CheckOutItem> getAllCheckOutItems() {
        return new ArrayList<CheckOutItem>((List) Arrays.asList(checkOutItems.values().toArray()));
    }
    public static Integer getSize(){
        return checkOutItems.size();
    }

    public static final HashMap<Integer, CheckOutItem> checkOutItems = new HashMap<>();

    public static void addItem(CheckOutItem newItem) {
        checkOutItems.put(checkOutID, newItem);
        checkOutID+=1;
        orderTotal += newItem.itemPrice * ItemDetailActivity.quantityCounter;
    }
}

