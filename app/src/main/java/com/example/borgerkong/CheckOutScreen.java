package com.example.borgerkong;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class CheckOutScreen extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_out_screen);

        recyclerView = findViewById(R.id.rv_menu);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        CheckOutAdapter checkOutAdapter = new CheckOutAdapter();
        checkOutAdapter.setData(CheckOut.getAllCheckOutItems());
        recyclerView.setAdapter(checkOutAdapter);

        TextView orderTotal = findViewById(R.id.orderTotal);
        orderTotal.setText(String.format(getString(R.string.Order_Total), CheckOut.orderTotal));
    }
}