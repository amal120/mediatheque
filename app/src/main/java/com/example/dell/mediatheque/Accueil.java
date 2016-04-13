package com.example.dell.mediatheque;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Accueil extends AppCompatActivity implements View.OnClickListener {



    TextView etDoc;
    TextView etPlace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        etDoc = (TextView) findViewById(R.id.etDoc);
        etDoc.setOnClickListener(this);
        etPlace = (TextView) findViewById(R.id.etPlace);
        etPlace.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.etDoc:
                startActivity(new Intent(this, DocInterface.class));

                break;
            case R.id.etPlace:
                startActivity(new Intent(this, Place.class));
                break;
        }
    }

}
