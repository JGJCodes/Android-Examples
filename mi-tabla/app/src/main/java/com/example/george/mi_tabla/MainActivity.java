package com.example.george.mi_tabla;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    //Codigo unico
    int[] etiquetas;
    int val = 1;
    Button botones[] = new Button[25];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creación del arreglo
        etiquetas = new int[26];
        int aux, posRand;
        for (int i = 0; i < 26; i++) {
            etiquetas[i] = i;
        }

        //Revolver el arreglo.
        for (int j = 1; j < 26; j++) {
            posRand = (int) (Math.ceil(Math.random() * 25));
            aux = etiquetas[posRand];
            etiquetas[posRand] = etiquetas[j];
            etiquetas[j] = aux;
        }

        // Vaciar arreglo al activity
        botones[0] = (Button) findViewById(R.id.button1);
        botones[1] = (Button) findViewById(R.id.button2);
        botones[2] = (Button) findViewById(R.id.button3);
        botones[3] = (Button) findViewById(R.id.button4);
        botones[4] = (Button) findViewById(R.id.button5);
        botones[5] = (Button) findViewById(R.id.button6);
        botones[6] = (Button) findViewById(R.id.button7);
        botones[7] = (Button) findViewById(R.id.button8);
        botones[8] = (Button) findViewById(R.id.button9);
        botones[9] = (Button) findViewById(R.id.button10);
        botones[10] = (Button) findViewById(R.id.button11);
        botones[11] = (Button) findViewById(R.id.button12);
        botones[12] = (Button) findViewById(R.id.button13);
        botones[13] = (Button) findViewById(R.id.button14);
        botones[14] = (Button) findViewById(R.id.button15);
        botones[15] = (Button) findViewById(R.id.button16);
        botones[16] = (Button) findViewById(R.id.button17);
        botones[17] = (Button) findViewById(R.id.button18);
        botones[18] = (Button) findViewById(R.id.button19);
        botones[19] = (Button) findViewById(R.id.button20);
        botones[20] = (Button) findViewById(R.id.button21);
        botones[21] = (Button) findViewById(R.id.button22);
        botones[22] = (Button) findViewById(R.id.button23);
        botones[23] = (Button) findViewById(R.id.button24);
        botones[24] = (Button) findViewById(R.id.button25);

        for (int i = 0; i < 25; i++) {
            botones[i].setText(String.format("%d", etiquetas[i + 1]));
            botones[i].setOnClickListener(this);
        }

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
    @Override
    public void onClick(View v) {
        int j = 0;
        Button boton = (Button) findViewById(v.getId());
        if (boton.isPressed()) {
            j = Integer.parseInt(boton.getText().toString());
            if (val == j) {
                boton.setClickable(false);
                boton.setText("");
                boton.setBackgroundColor(Color.WHITE);
                val++;
            }
            if (val==26){
                newActivity(v);
            }
        }
    }

    public void newActivity(View v){
        Intent intento = new Intent(this,Winner.class);
        startActivity(intento);
    }
}
