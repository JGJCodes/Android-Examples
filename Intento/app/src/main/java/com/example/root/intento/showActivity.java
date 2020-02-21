package com.example.root.intento;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.security.Principal;

public class showActivity extends AppCompatActivity {

    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        //Recoger datos
        Intent intento = getIntent();
        String nombre = intento.getStringExtra(MainActivity.NOMBRE);
        String paterno = intento.getStringExtra(MainActivity.PATERNO);
        String materno = intento.getStringExtra(MainActivity.MATERNO);
        //Mostrar datos recogidos
        textView1 = (TextView) findViewById(R.id.mostrar);
        textView1.setText("Bienvenido " + nombre + " " + paterno + " " + materno);
    }

}
