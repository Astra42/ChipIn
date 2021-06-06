package com.chipin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class CreateEvent extends AppCompatActivity {

    private EditText name_field;
    private EditText date_field;
    private EditText members_field;
    private EditText location_field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_event);

        name_field = findViewById(R.id.event_enter_name);
        date_field = findViewById(R.id.event_enter_date);
        location_field = findViewById(R.id.event_enter_location);
        members_field = findViewById(R.id.event_enter_members);

        date_field.addTextChangedListener(new TextWatcher() {
            private String current = "";
            private String ddmmyyyy = "ДДММГГГГ";
            private Calendar cal = Calendar.getInstance();


            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().equals(current)) {
                    String clean = s.toString().replaceAll("[^\\d.]", "");
                    String cleanC = current.replaceAll("[^\\d.]", "");

                    int cl = clean.length();
                    int sel = cl;
                    for (int i = 2; i <= cl && i < 6; i += 2) {
                        sel++;
                    }
                    if (clean.equals(cleanC)) sel--;

                    if (clean.length() < 8){
                        clean = clean + ddmmyyyy.substring(clean.length());
                    }else{
                        int day  = Integer.parseInt(clean.substring(0,2));
                        int mon  = Integer.parseInt(clean.substring(2,4));
                        int year = Integer.parseInt(clean.substring(4,8));

                        if(mon > 12) mon = 12;
                        cal.set(Calendar.MONTH, mon-1);

                        year = (year<1900)?1900:(year>2100)?2100:year;
                        cal.set(Calendar.YEAR, year);

                        day = (day > cal.getActualMaximum(Calendar.DATE))? cal.getActualMaximum(Calendar.DATE):day;
                        clean = String.format("%02d%02d%02d",day, mon, year);
                    }

                    clean = String.format("%s/%s/%s", clean.substring(0, 2),
                            clean.substring(2, 4),
                            clean.substring(4, 8));

                    sel = sel < 0 ? 0 : sel;
                    current = clean;
                    date_field.setText(current);
                    date_field.setSelection(sel < current.length() ? sel : current.length());
                }
            }


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    public void goBack(View view) {
        finish();
    }

    public void createEvent(View view) {
        if (!name_field.getText().toString().trim().equals("")
                && !date_field.getText().toString().trim().equals("")
                && !location_field.getText().toString().trim().equals("")
                && !members_field.getText().toString().trim().equals("")) {

            MainActivity.name = name_field.getText().toString();
            MainActivity.date = date_field.getText().toString();
            MainActivity.location = location_field.getText().toString();
            MainActivity.members = members_field.getText().toString();

            Intent intent = new Intent(CreateEvent.this, MainMenu.class);
            startActivity(intent); }
        else {
            Toast.makeText(CreateEvent.this, R.string.not_enough_input, Toast.LENGTH_SHORT).show(); }
    }
}