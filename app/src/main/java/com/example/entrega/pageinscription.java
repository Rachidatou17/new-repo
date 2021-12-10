package com.example.entrega;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.text.BreakIterator;

public class pageinscription extends AppCompatActivity {
private Button btn;
private EditText username;
private EditText email;
private EditText password;
private EditText passwordconfirmation;
private TextView inscription;
private TextView end;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageinscription);
        btn=findViewById(R.id.register);
        username=findViewById(R.id.username);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        passwordconfirmation=findViewById(R.id.confpasse);
        inscription=findViewById(R.id.inscription);
        end=findViewById(R.id.end);
        mAuth = FirebaseAuth.getInstance();

    }
    public void onclick(View v){
            Toast.makeText(this, "Vous-êtes inscrit", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

    }
    public void onregister(View v){

        String emailValue= email.getText().toString().trim();
        String passwordValue= password.getText().toString().trim();
        String usernameValue= username.getText().toString().trim();
        if (username.isDirty()){
            username.setError("full name is required!");
            username.requestFocus();
            return;
        }
        if (email.isDirty()){
            email.setError("full email is required!");
            email.requestFocus();
            return;
    }



}
}