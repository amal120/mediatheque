package com.example.dell.mediatheque;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etname,etpass;
    String login_name,login_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname = (EditText) findViewById(R.id.login);
        etpass = (EditText) findViewById(R.id.password);

    }

  public void userReg (View view)
  {
      startActivity(new Intent(this,Register.class));

  }
     public void userLogin (View view)
     {
         login_name = etname.getText().toString();
         login_pass = etpass.getText().toString();
         String method = "login";
         BackgroundTask backgroundTask = new BackgroundTask(this);
         backgroundTask.execute(method,login_name,login_pass);
         startActivity(new Intent(this, Accueil.class));

     }

}
