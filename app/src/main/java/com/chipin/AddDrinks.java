package com.chipin;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddDrinks extends AppCompatActivity {

    private EditText name_field;
    private EditText members_field;
    private EditText price_field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_new_drinks);

        name_field = findViewById(R.id.drink_enter_name);
        members_field = findViewById(R.id.drink_enter_members);
        price_field = findViewById(R.id.drink_enter_price);
    }

    public void goBack(View view) {
        finish();
    }

    public void addNewPosition(View view) {
        if (!name_field.getText().toString().trim().equals("")
                && !price_field.getText().toString().trim().equals("")
                && !members_field.getText().toString().trim().equals("")) {
            finish(); }
        else {
            Toast.makeText(AddDrinks.this, R.string.not_enough_input, Toast.LENGTH_SHORT).show(); }
    }
}