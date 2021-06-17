package com.chipin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public static String name;
    public static String location;
    public static String date;
    public static String members;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createEvent(View view) {
        Intent intent = new Intent(MainActivity.this, CreateEvent.class);
        startActivity(intent);
    }
}

