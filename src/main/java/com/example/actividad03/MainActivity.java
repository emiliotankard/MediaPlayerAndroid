package com.example.actividad03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); //para quitar el actionBar
    }

    //Boton para ir a la Activity de la actividad XML
    public void bt_entrar(View view){
        Intent i = new Intent(this, MediaPlayerActivity.class);
        startActivity(i);
    }
}