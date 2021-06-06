package com.chipin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
    }

    public void goToFood(View view) {
        Intent intent = new Intent(MainMenu.this, FoodMenu.class);
        startActivity(intent);
    }

    public void goToDrinks(View view) {
        Intent intent = new Intent(MainMenu.this, DrinksMenu.class);
        startActivity(intent);
    }

    public void gotToElse(View view) {
        Intent intent = new Intent(MainMenu.this, ElseMenu.class);
        startActivity(intent);
    }

    public void goToEvent(View view) {
        Intent intent = new Intent(MainMenu.this, EventInfo.class);
        startActivity(intent);
    }
}