package com.example.root.intento_imp;

import android.content.Intent;
import android.net.Uri;
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

    public void intentImp(View v){
        Intent intento = null;
        EditText editText;
        String var = null;
        switch(v.getId()){
            case R.id.button1:
                editText = (EditText) findViewById(R.id.geoText);
                var = editText.getText().toString();
                var = var.replace(' ', '+');
                intento = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q=" + var));
                startActivityForResult(intento, 0);
                break;
            case R.id.button2:
                editText = (EditText) findViewById(R.id.interText);
                var = editText.getText().toString();
                intento = new Intent(Intent.ACTION_VIEW,Uri.parse("http://" + var));
                startActivityForResult(intento, 0);
                break;
            case R.id.button3:
                editText = (EditText) findViewById(R.id.marcarText);
                var = editText.getText().toString();
                intento = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:(+52)" + var));
                startActivityForResult(intento, 0);
                break;
            case R.id.button4:
                editText = (EditText) findViewById(R.id.llamarText);
                var = editText.getText().toString();
                intento = new Intent(Intent.ACTION_CALL,Uri.parse("tel:(+52)" + var));
                startActivityForResult(intento, 0);
                break;
            case R.id.button5:
                intento = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivityForResult(intento,0);
                break;
            case R.id.button6:
                intento = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                startActivity(intento);
                break;
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
}
