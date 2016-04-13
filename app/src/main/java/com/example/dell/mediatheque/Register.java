package com.example.dell.mediatheque;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText etMat1, etName1, etClass1, etUsername1, etPassword1;
    String matricule ,name, classe , login, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etMat1 = (EditText) findViewById(R.id.etMat);
        etName1 = (EditText) findViewById(R.id.etName);
        etClass1 = (EditText) findViewById(R.id.etClass);
        etUsername1 = (EditText) findViewById(R.id.etUsername);
        etPassword1= (EditText) findViewById(R.id.etPassword);


    }
    public void userReg (View view)
    {
        matricule  = etMat1.getText().toString();

        name  = etName1.getText().toString();
        classe  = etClass1.getText().toString();
        login  = etUsername1.getText().toString();
        password  = etPassword1.getText().toString();
        String method = "register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,matricule,name,classe,login,password);
        finish();
    }

}
