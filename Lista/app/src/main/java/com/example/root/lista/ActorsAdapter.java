package com.example.root.lista;

import android.content.Context;
import android.content.Entity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ActorsAdapter extends ArrayAdapter {

    private Context context;
    private ArrayList<Actor> datos;

    public ActorsAdapter(Context context, ArrayList datos) {
        super(context, R.layout.activity_elemento, datos);
        // Guardamos los parámetros en variables de clase.
        this.context = context;
        this.datos = datos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /* En primer lugar "inflamos" una nueva vista, que será la que se
         mostrará en la celda del ListView. Para ello primero creamos el
         inflater, y después inflamos la vista.*/
        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.activity_elemento, null);

        /* A partir de la vista, recogeremos los controles que contiene para
         poder manipularlos. Recogemos el ImageView y le asignamos una foto.*/
        ImageView imagen = (ImageView) item.findViewById(R.id.imageView);
        imagen.setImageResource(datos.get(position).getDrawableImageID());

        // Recogemos el TextView para mostrar el nombre y establecemos el nombre.
        TextView nombre = (TextView) item.findViewById(R.id.textview1);
        nombre.setText(datos.get(position).getNombre());

        // Recogemos el TextView para mostrar la descripcion y establecemos la descripcion.
        TextView descrip = (TextView) item.findViewById(R.id.textview2);
        descrip.setText(datos.get(position).getDescripcion());

        // Devolvemos la vista para que se muestre en el ListView.
        return item;
    }


}
