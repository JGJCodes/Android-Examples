package com.example.root.lista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Elemento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elemento);
        mostrarElemento();
    }

    public void mostrarElemento() {
        Intent intento = getIntent();
        //int elemento = intento.getIntExtra();

    }
}
