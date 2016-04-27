package com.example.dell.mediatheque;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Place extends AppCompatActivity {
    EditText etMat2;
    EditText etRes1;
    EditText etHeur1;
    String heureRes;
    String mat_etud;
    String dateRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        etMat2 = (EditText) findViewById(R.id.etMatt);
        etRes1 = (EditText) findViewById(R.id.etRes);
        etHeur1 = (EditText) findViewById(R.id.etHeur);

    }
    public void userP(View view)
    {
        mat_etud  = etMat2.getText().toString();
        dateRes  = etRes1.getText().toString();
        heureRes  = etHeur1.getText().toString();
        String method = "reservplac";
      BackgroundTask3 backgroundTask3 = new BackgroundTask3(this);
        backgroundTask3.execute(method,dateRes,heureRes,mat_etud);
        finish();
    }
    public void userPlac (View view)
    {
        startActivity(new Intent(this, Mediatheque.class));

    }
}
