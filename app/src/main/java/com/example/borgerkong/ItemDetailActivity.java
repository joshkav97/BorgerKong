package com.example.borgerkong;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ItemDetailActivity extends AppCompatActivity {

    private TextView itemName;
    private ImageView itemImage;
    private Double itemPrice;
    private TextView subTotal;
    private TextView itemDescription;
    private TextView itemQuantity;
    public static int quantityCounter = 1;
    private Button decreaseQuantity;
    private Button increaseQuantity;
    private Button addToOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        Intent intent = getIntent();

        int itemID = intent.getIntExtra("itemID", 0);

        final MenuItem menuItem = MenuDatabase.getMenuItemByID(itemID);

        itemName = findViewById(R.id.itemName);
        itemImage = findViewById(R.id.itemImage);
        subTotal = findViewById(R.id.subTotal);
        itemDescription = findViewById(R.id.itemDescription);
        itemQuantity = findViewById(R.id.itemQuantity);
        decreaseQuantity = findViewById(R.id.decreaseQuantity);
        increaseQuantity = findViewById(R.id.increaseQuantity);
        addToOrder = findViewById(R.id.addToOrder);


        // Set the views to show the data of our object
        itemName.setText(menuItem.getItemName());
        itemImage.setImageResource(menuItem.getImageDrawableID());
        itemPrice = menuItem.getItemPrice();
        subTotal.setText(getResources().getString(R.string.subtotal, itemPrice * quantityCounter));
        itemDescription.setText(menuItem.getItemDescription());
        itemQuantity.setText(Integer.toString(quantityCounter));

        Button orderButton = findViewById(R.id.orderButton);
        orderButton.setText(R.string.view_order);
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, CheckOutScreen.class);
                context.startActivity(intent);
            }
        });

        decreaseQuantity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quantityCounter > 1) {
                    quantityCounter -= 1;
                    itemQuantity.setText(Integer.toString(quantityCounter));
                    subTotal.setText(getResources().getString(R.string.subtotal, itemPrice * quantityCounter));
                } else quantityCounter = 1;
            }
        });


        increaseQuantity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantityCounter += 1;
                itemQuantity.setText(Integer.toString(quantityCounter));
                subTotal.setText(getResources().getString(R.string.subtotal, itemPrice * quantityCounter));
            }
        });

        addToOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final CheckOutItem newItem = new CheckOutItem(CheckOut.getSize()+1,menuItem.getItemName(), itemPrice, quantityCounter, menuItem.getImageDrawableID());
                CheckOut.addItem(newItem);

                Context context = getApplicationContext();
                String text = "Item Added!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
}
