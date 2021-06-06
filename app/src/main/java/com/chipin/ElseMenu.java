package com.chipin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ElseMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.else_menu);
    }

    public void goBack(View view) {
        finish();
    }

    public void addNewPosition(View view) {
        Intent intent = new Intent(ElseMenu.this, AddElse.class);
        startActivity(intent);
    }
}