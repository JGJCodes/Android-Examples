package com.example.root.pelculas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements OnListItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
    }

    @Override
    public void onListClick(int arg) {
        SinopsisFragment sinopsis = (SinopsisFragment) this.getFragmentManager().findFragmentById(R.id.fragment_sinopsis);
        sinopsis.mostrar(arg);
    }
}
