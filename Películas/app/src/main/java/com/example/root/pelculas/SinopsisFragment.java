package com.example.root.pelculas;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SinopsisFragment extends Fragment {

    ViewGroup root;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = (ViewGroup) inflater.inflate(R.layout.fragment_sinopsis, null);
        return root;

    }
    public void mostrar(int arg){
        TextView titulo = (TextView) root.findViewById(R.id.pelicula_titulo);
        ImageView imagen = (ImageView) root.findViewById(R.id.pelicula_imagen);
        TextView sinopsis = (TextView) root.findViewById(R.id.pelicula_sinopsis);

        String[] titulo_array = getResources().getStringArray(R.array.tituloPelicula);
        String[] sinop_array = getResources().getStringArray(R.array.sinopsisPelicula);

        switch (arg){
            case 0: titulo.setText(titulo_array[0]);
                    imagen.setImageResource(R.drawable.dbz1);
                    sinopsis.setText(sinop_array[0]);
                    break;
            case 1: titulo.setText(titulo_array[1]);
                    imagen.setImageResource(R.drawable.dbz2);
                    sinopsis.setText(sinop_array[1]);
                    break;
            case 2: titulo.setText(titulo_array[2]);
                    imagen.setImageResource(R.drawable.dbz3);
                    sinopsis.setText(sinop_array[2]);
                    break;
            case 3: titulo.setText(titulo_array[3]);
                    imagen.setImageResource(R.drawable.dbz4);
                    sinopsis.setText(sinop_array[3]);
                    break;
            case 4: titulo.setText(titulo_array[4]);
                    imagen.setImageResource(R.drawable.dbz5);
                    sinopsis.setText(sinop_array[4]);
                    break;
            case 5: titulo.setText(titulo_array[5]);
                    imagen.setImageResource(R.drawable.dbz6);
                    sinopsis.setText(sinop_array[5]);
                    break;
        }
    }

}
