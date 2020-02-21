package com.example.root.pelculas;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Titulo extends Fragment  implements OnItemClickListener {

    ListView lista;
    Activity actividad;
    OnListItemClickListener llamadaLista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_titulo, null);
        inicializar(root);
        return root;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.actividad = activity;
        try {
            llamadaLista = (OnListItemClickListener) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + "No se pudo usar la llamada");
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        llamadaLista.onListClick(position);
    }

    public void inicializar(View v){
        String [] titulos = getResources().getStringArray(R.array.titulos);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(actividad,android.R.layout.simple_list_item_1, titulos);
        lista = (ListView) v.findViewById(R.id.Titulos);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(this);
    }
}