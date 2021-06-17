package com.chipin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EventInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_info);

        TextView event_name = findViewById(R.id.event_name);
        TextView event_location = findViewById(R.id.event_location);
        TextView event_date = findViewById(R.id.event_date);
        TextView event_members = findViewById(R.id.event_members);

        event_name.setText(MainActivity.name);
        event_location.setText(MainActivity.location);
        event_date.setText(MainActivity.date);
        event_members.setText(MainActivity.members);
    }

    public void goBack(View view) {
        finish();
    }
}