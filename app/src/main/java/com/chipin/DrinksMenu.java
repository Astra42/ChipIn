package com.chipin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DrinksMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drinks_menu);
    }

    public void goBack(View view) {
        finish();
    }

    public void addNewPosition(View view) {
        Intent intent = new Intent(DrinksMenu.this, AddDrinks.class);
        startActivity(intent);
    }
}