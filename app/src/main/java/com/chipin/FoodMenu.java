package com.chipin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FoodMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_menu);
    }

    public void goBack(View view) {
        finish();
    }

    public void addNewPosition(View view) {
        Intent intent = new Intent(FoodMenu.this, AddFood.class);
        startActivity(intent);
    }
}