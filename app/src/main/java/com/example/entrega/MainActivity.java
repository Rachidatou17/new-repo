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

public class MainActivity extends AppCompatActivity {
    private TextView connexion;
    private EditText name;
    private EditText password;
    private Button btn;
    private TextView cop;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connexion=findViewById(R.id.title);
        name=findViewById(R.id.Name);
        password=findViewById(R.id.password);
        btn=findViewById(R.id.login);
        cop=findViewById(R.id.end);






    }
    public void onclick(View V){
        Toast.makeText(this, "Vous-êtes connecté", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,pageacceuil.class);
        startActivity(intent);

    }
}