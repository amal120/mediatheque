package com.example.dell.mediatheque;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int itemPosition     = position;

                String  itemValue    = (String) listView.getItemAtPosition(position);

                switch (itemPosition){
                    case 0:
                        Intent intent = new Intent(DocInterface.this, infoDocument.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent inten = new Intent(DocInterface.this, infoDocument.class);
                        startActivity(inten);
                        break;
                    case 2:
                        Intent intentt = new Intent(DocInterface.this, infoDocument.class);
                        startActivity(intentt);
                        break;
                    case 3:
                        Intent intenttz = new Intent(DocInterface.this, infoDocument.class);
                        startActivity(intenttz);
                        break;
                    case 4:
                        Intent intenttrr = new Intent(DocInterface.this, infoDocument.class);
                        startActivity(intenttrr);
                        break;
                    case 5:
                        Intent intenttr = new Intent(DocInterface.this, infoDocument.class);
                        startActivity(intenttr);
                        break;
                    case 6:
                        Intent intentte = new Intent(DocInterface.this, infoDocument.class);
                        startActivity(intentte);
                        break;
                    case 7:
                        Intent intenttt = new Intent(DocInterface.this, infoDocument.class);
                        startActivity(intenttt);
                        break;
                }



            }

        });
    }

}