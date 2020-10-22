package com.example.listviewhw;

import android.view.View;
import android.widget.Toast;

public class MyOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(final View view) {

        Toast.makeText(getClass(), "ceva", Toast.LENGTH_LONG).show();
    }
}
