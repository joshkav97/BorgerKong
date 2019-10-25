package com.example.borgerkong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MenuDatabase {

    public static MenuItem getMenuItemByID(int itemID){
        return menuItems.get(itemID);
    }

    public static ArrayList<MenuItem> getAllMenuItems(){
        return new ArrayList<MenuItem>((List) Arrays.asList(menuItems.values().toArray()));
    }

    public static final HashMap<Integer, MenuItem> menuItems = new HashMap<>();

    static {
        menuItems.put(1, new MenuItem(
                1, "Whopper", 6.70, "Some things just can’t be improved. The Whopper® is 100% " +
                "hormone-free Aussie beef, flame-grilled that gives you the irresistible smoky, " +
                "BBQ flavour. Loaded with crisp fresh lettuce, ripe hand-cut tomatoes, onion, " +
                "pickles, mayo and tomato sauce on a toasted sesame seed bun. An Aussie legend for " +
                "over 40 years.", R.drawable.whopper));
        menuItems.put(2, new MenuItem(
                2, "Whopper Cheese", 7.50, "All the flame-grilled, flavour-packed perfection of a " +
                "Whopper®, but topped with a slice of cheese.", R.drawable.whopper_cheese));
        menuItems.put(3, new MenuItem(
                3, "Double Whopper", 8.70, "Think of a Whopper®. Think of the crispy lettuce and ripe " +
                "tomato. Think of the freshly-toasted sesame seed bun. Think of the flame-grilled " +
                "Aussie beef. Now double it.", R.drawable.double_whopper));
        menuItems.put(4, new MenuItem(
                4, "Double Whopper Cheese", 10.30, "Double the flavour with two flame-grilled " +
                "Australian beef patties with no added hormones. Topped with cheese, ripe hand-cut " +
                "tomato, fresh lettuce, onion, pickles, mayo and tomato sauce on a toasted sesame " +
                "seed bun.", R.drawable.double_whopper_cheese));
        menuItems.put(5, new MenuItem(
                5, "Whopper Junior", 5.50, "It's just like the legendary Whopper®, only smaller. " +
                "Same great flame-grilled Australian beef with no added hormones, ripe hand-cut " +
                "tomato, fresh lettuce, onion, pickles, mayo and tomato sauce on a toasted sesame " +
                "seed bun.", R.drawable.whopper_junior));
        menuItems.put(6, new MenuItem(
                6, "Whopper Junior Cheese", 5.90, "Think of a Whopper®. Think of the crispy lettuce and ripe " +
                "tomato. Think of the freshly-toasted sesame seed bun. Think of the flame-grilled " +
                "Aussie beef. Now double it.", R.drawable.whopper_junior_cheese));
        menuItems.put(7, new MenuItem(
                7, "Tendercrisp Caesar", 8.30, "Aussie crispy chicken breast and premium eye bacon, " +
                "topped with creamy Caesar sauce, parmesan cheese, tomato and lettuce on a toasted " +
                "sesame seed bun.", R.drawable.tendercrisp_caeser));
        menuItems.put(8, new MenuItem(
                8, "Grilled Chicken Caeser", 8.30, "Flame grilled Aussie chicken breast and premium " +
                "eye bacon, topped with creamy Caesar sauce, parmesan cheese, tomato and lettuce on " +
                "a toasted sesame seed bun.", R.drawable.grilled_chicken_caeser));
        menuItems.put(9, new MenuItem(
                9, "Grilled Chicken Peri Peri", 6.50, "Flame-grilled chicken breast fillet, topped " +
                "with Peri Peri and fresh salad with our creamy Mayo on a toasted sesame seed bun. " +
                "If you love chicken, you will love our succulent flame-grilled breast fillet " +
                "chicken burger.", R.drawable.grilled_chicken_peri_peri));
        menuItems.put(10, new MenuItem(
                10, "Tendercrisp Classic", 6.50, "Like tender, juicy, 100% chicken breast fillets " +
                "in a golden crispy coating? Then Tendercrisp® is made for you. It comes with " +
                "hand-cut tomato, lettuce and creamy mayo on a sesame seed bun.", R.drawable.tendercrisp_classic));
        menuItems.put(11, new MenuItem(
                11, "Thick Cut Chips", 3.15, "Our thick cut chips are deliciously seasoned, " +
                "delivering a crispier crunch on the outside, fluffy and hot on the inside. The " +
                "chips are better at Hungry Jack's. Available in Small, Medium or Large.", R.drawable.thick_cut_chips));
        menuItems.put(12, new MenuItem(
                12, "Cheesy Loaded Chips", 3.45, "Cheesy Loaded Chips – try our golden, crispy, " +
                "Thick Cut Chips, topped with creamy cheesy sauce for a treat that’s bursting with " +
                "taste and flavour. It’s the perfect topping for the chips you love.", R.drawable.cheesy_loaded_chips));
        menuItems.put(13, new MenuItem(
                13, "6 Pack Nuggets", 3.95, "Crispy, golden nuggets made with 100% chicken breast, " +
                "cooked in sunflower and canola oil for a better tasting golden finish. Our " +
                "nuggets are as good as gold. Choose from our delicious dipping sauces BBQ, Spicy, " +
                "Honey Mustard or Sweet 'n Sour sauce. ", R.drawable.nuggets));
        menuItems.put(14, new MenuItem(
                14, "Onion Rings", 3.80, "A Hungry Jack's favourite, you'll be crying over if you " +
                "miss them! Freshly battered, crispy onion rings.", R.drawable.onion_rings));
        menuItems.put(15, new MenuItem(
                15, "Angry Onion Rings", 3.80, "If you like it hot then you'll be angry if you " +
                "miss these spicy, tempura battered onions.", R.drawable.angry_onion_rings));
    }

}
