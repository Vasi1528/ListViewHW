package com.example.listviewhw;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FridayAdapter extends RecyclerView.Adapter<FridayViewHolder>{
    private final OnClickListener mOnClickListener = new MyOnClickListener();
private List<FridayModel> fridayModelList;
    @NonNull
    @Override
    public FridayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_friday_example,parent,false);
        Toast.makeText(parent.getContext(), "text1111", Toast.LENGTH_LONG).show();
        view.setOnClickListener(mOnClickListener);
        return new FridayViewHolder(view);
    }
public FridayAdapter(List<FridayModel> fridayModelList){
    this.fridayModelList = fridayModelList;
}
    @Override
    public void onBindViewHolder(@NonNull FridayViewHolder viewHolder, int position) {
FridayModel fridayModel=fridayModelList.get(position);
viewHolder.setValues(fridayModel.getName(),fridayModel.getFirstName());
    }

    @Override
    public int getItemCount() {
        return fridayModelList.size();
    }
}
