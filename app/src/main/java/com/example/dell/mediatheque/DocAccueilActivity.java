package com.example.dell.mediatheque;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DocAccueilActivity extends AppCompatActivity implements View.OnClickListener {

    TextView etDocc;
    TextView etDock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_accueil);
        etDocc = (TextView) findViewById(R.id.etDocc);
        etDocc.setOnClickListener(this);
        etDock = (TextView) findViewById(R.id.etDock);
        etDock.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.etDocc:
                startActivity(new Intent(this, DocInterface.class));

                break;
            case R.id.etDock:
                startActivity(new Intent(this, ValiderDoc.class));
                break;
        }
    }

}