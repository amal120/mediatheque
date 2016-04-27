package com.example.dell.mediatheque;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DocInterface extends AppCompatActivity {
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document);
        listView = (ListView) findViewById(R.id.list);

        String[] values = new String[] { "Les misérables",
                "rapport",
                "pfe",
                "livreSanté",
                "livreFinance",
                "LivreInformatique",
                "LivreComptabilité",
                "livreChimie"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        listView.setAdapter(adapter);



            }

    }

