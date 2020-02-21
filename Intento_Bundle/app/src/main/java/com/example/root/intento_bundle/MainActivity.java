package com.example.root.intento_bundle;

import android.content.Intent;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String nombre, apePaterno, apeMaterno, email, telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }

    public void registro(View v){
        //Recuperacion de los datos escritos
        final EditText editNombre = (EditText)findViewById(R.id.nombre);
        final EditText editPaterno = (EditText)findViewById(R.id.apePaterno);
        final EditText editMaterno = (EditText)findViewById(R.id.apeMaterno);
        final EditText editEmail = (EditText)findViewById(R.id.email);
        final EditText editTel = (EditText)findViewById(R.id.telefono);
        Button btnEnviar = (Button)findViewById(R.id.button1);

        //Almacenamiento de los datos en variables
        nombre = editNombre.getText().toString();
        apePaterno = editPaterno.getText().toString();
        apeMaterno = editMaterno.getText().toString();
        email = editEmail.getText().toString();
        telefono = editTel.getText().toString();

        //Creacion y escritura del objeto Bundle
        Bundle usuario = new Bundle();
        usuario.putString("NOMBRE", nombre);
        usuario.putString("PATERNO", apePaterno);
        usuario.putString("MATERNO", apeMaterno);
        usuario.putString("EMAIL", email);
        usuario.putString("TELEFONO", telefono);

        //Creacion y envio del objeto Intent
        Intent intento = new Intent();
        intento.setClass(this, Usuario.class);
        intento.putExtras(usuario);
        startActivity(intento);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
