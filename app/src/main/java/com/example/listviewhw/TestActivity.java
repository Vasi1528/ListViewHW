package com.example.listviewhw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {
private RecyclerView fridayRv;
private FridayAdapter fridayAdapter;
private List<FridayModel> fridayModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initalizeViews();
        initalizeList();
        setRecyclerView();
    }



    private void initalizeViews() {
        fridayRv = findViewById(R.id.rv_test_list);
    }
    public void initalizeList(){
        fridayModelList = new ArrayList<>();
        fridayModelList.add(new FridayModel("Dan","BBB",6));
        fridayModelList.add(new FridayModel("Alex","BB",12));
        fridayModelList.add(new FridayModel("Dan","BBB",22));
        fridayModelList.add(new FridayModel("Dan","BBB",32));
    }
    private void setRecyclerView() {
        fridayAdapter = new FridayAdapter(fridayModelList);
        fridayRv.setLayoutManager(new LinearLayoutManager(this));
        fridayRv.setAdapter(fridayAdapter);
    }
}