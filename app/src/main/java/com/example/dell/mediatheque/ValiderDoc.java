package com.example.dell.mediatheque;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ValiderDoc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valider_doc);


}
    public void userDoc (View view)
    {
        startActivity(new Intent(this, DocInterface.class));

    }
    public void userAnnulerr (View view)
    {
        startActivity(new Intent(this, Accueil.class));

    }
}
