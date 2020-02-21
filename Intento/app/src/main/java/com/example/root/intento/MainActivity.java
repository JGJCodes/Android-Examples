package com.example.root.intento;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Codigo unico
    public final static String NOMBRE = "com.example.pasardatosactivity.NOMBRE";
    public final static String PATERNO = "com.example.pasardatosactivity.PATERNO";
    public final static String MATERNO = "com.example.pasardatosactivity.MATERNO";

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

    //Codigo unico
    public void newActivity(View v){
        Intent intento= new Intent(this,showActivity.class);;
        EditText nombre = (EditText) findViewById(R.id.nombre);
        EditText apePaterno = (EditText) findViewById(R.id.paterno);
        EditText apeMaterno = (EditText) findViewById(R.id.materno);
        intento.putExtra(NOMBRE, nombre.getText().toString());
        intento.putExtra(PATERNO, apePaterno.getText().toString());
        intento.putExtra(MATERNO, apeMaterno.getText().toString());
        startActivity(intento);

    }
}
