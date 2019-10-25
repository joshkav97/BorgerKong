package com.example.borgerkong;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CheckOutAdapter extends RecyclerView.Adapter<CheckOutAdapter.CheckOutViewHolder> {

    public ArrayList<CheckOutItem> checkOutItems;

    @NonNull
    @Override
    public CheckOutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.checkout_item, parent, false);

        CheckOutViewHolder CheckOutViewHolder = new CheckOutViewHolder(view);
        return CheckOutViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CheckOutViewHolder holder, int position) {
        final CheckOutItem itemAtPosition = checkOutItems.get(position);
        holder.itemName.setText(itemAtPosition.getItemName());
        holder.itemImage.setImageResource(itemAtPosition.getImageDrawableID());
        holder.itemQuantity.setText((Integer.toString(itemAtPosition.getItemQuantity())));
    }

    @Override
    public int getItemCount() {
        return checkOutItems.size();
    }

    public void setData(ArrayList<CheckOutItem> CheckOutItems) {
        this.checkOutItems = CheckOutItems;
    }

    public class CheckOutViewHolder extends RecyclerView.ViewHolder {
        public TextView itemName;
        public ImageView itemImage;
        public TextView itemQuantity;
        public View view;

        public CheckOutViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            itemName = itemView.findViewById(R.id.itemName);
            itemImage = itemView.findViewById(R.id.itemImage);
            itemQuantity = itemView.findViewById(R.id.itemQuantity);
        }
    }
}

