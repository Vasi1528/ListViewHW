package com.example.listviewhw;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FridayViewHolder extends RecyclerView.ViewHolder{
    private TextView nameTV;
    private TextView firstnameTV;
    public FridayViewHolder(@NonNull View itemView) {
        super(itemView);
        initializeViews();
    }

    private void initializeViews() {
        nameTV=itemView.findViewById(R.id.row_friday_name);
        firstnameTV=itemView.findViewById(R.id.row_friday_firstname);
    }
    public void setValues(String name,String firstname){
        nameTV.setText(name);
        firstnameTV.setText(firstname);
    }
}
