package com.example.root.lista;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    ArrayList<Actor> actores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarLista();
    }

    private void inicializarLista() {

        //Creamos los actores en el ArrayList
        rellenarArrayList();

        //Adaptamos el ArrayList con ActorsAdapter
        ActorsAdapter adapter = new ActorsAdapter(this,actores);
        setListAdapter(adapter);

    }

    private void rellenarArrayList() {
        actores.add(new Actor("Mario Castañeda", R.drawable.goku,"Es el actor de doblaje que da voz a Son Goku"));
        actores.add(new Actor("René García", R.drawable.vegueta,"Es el actor de doblaje que da voz a Vegueta"));
        actores.add(new Actor("Gerardo Reyedo", R.drawable.frezzer,"Es el actor de doblaje que da voz a Frezzer"));
    }

    @Override //Metodo que registra una accion para el evento click
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intento = new Intent(this,Elemento.class);
        intento.putExtra("position",position);
        startActivity(intento);
    }
}
