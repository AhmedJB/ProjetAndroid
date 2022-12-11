package com.example.mytodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.mytodo.Utils.DatabaseHandler;

public class Register extends AppCompatActivity {

    EditText usernm,pass;
    DatabaseHandler dh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        dh = new DatabaseHandler(this);
        dh.openDatabase();

        usernm = (EditText) findViewById(R.id.regUsername);
        pass = (EditText) findViewById(R.id.regPassword);


    }


    public void Register(View v){
        dh.createUser(usernm.getText().toString(),pass.getText().toString());
        LogLogin(v);
    }

    public void LogLogin(View v){
        Intent i = new Intent(this,Login.class);
        startActivity(i);
        finish();
    }
}