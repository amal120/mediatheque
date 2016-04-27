package com.example.dell.mediatheque;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class ValiderDoc extends AppCompatActivity {
    EditText etMa;
    EditText dater;
    EditText titrr;
    String matriculet;
    String dateEmprunt;
    String titreD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valider_doc);
        etMa = (EditText) findViewById(R.id.etMatr);
        dater = (EditText) findViewById(R.id.etEmprunt);
        titrr = (EditText) findViewById(R.id.etTitt);

}
    public void userDoc (View view)
    {
        matriculet  = etMa.getText().toString();
        dateEmprunt  = dater.getText().toString();
        titreD  = titrr.getText().toString();
        String method = "resdoc";
        BackgroundTask2 backgroundTask2 = new BackgroundTask2(this);
        backgroundTask2.execute(method,matriculet,dateEmprunt,titreD);
        finish();

    }
    public void userAnnulerr (View view)
    {
        startActivity(new Intent(this, Mediatheque.class));

    }
}
