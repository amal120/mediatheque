package com.example.dell.mediatheque;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Date;

public class Place extends AppCompatActivity {
    EditText etMat2;
    DatePicker etRes1;
    TimePicker etHeur1;
    int heureRes;
    String mat_etud;
    String dateRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        etMat2 = (EditText) findViewById(R.id.etMatt);
        etRes1 = (DatePicker) findViewById(R.id.etRes);
        etHeur1 = (TimePicker) findViewById(R.id.etHeur);

    }
    public void userP(View view)
    {
        mat_etud  = etMat2.getText().toString();
        dateRes  = etRes1.getCalendarView().toString();
        heureRes  = etHeur1.getHour();
        String method = "reservplac";
      BackgroundTask3 backgroundTask3 = new BackgroundTask3(this);
        backgroundTask3.execute(method,mat_etud,dateRes, String.valueOf(heureRes));
        finish();
    }

}
