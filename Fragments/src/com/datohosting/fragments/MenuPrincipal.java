package com.datohosting.fragments;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MenuPrincipal extends ActionBarActivity implements OnItemClickListener {
	
	ArrayList<ObjetoEntradas> items = new ArrayList<ObjetoEntradas>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_principal);
		
		ActionBar actionBar = getSupportActionBar();
		
		/**INDICAR TITULO Y SUBTITULO**/
		actionBar.setTitle("EJ Fragment");
		actionBar.setSubtitle("Menu Principal");
		
		crearEntradas();  
	    EntradasAdapter adapter = new EntradasAdapter(this, items);
	    
	    ListView lv = (ListView)findViewById(R.id.list);
	    lv.setAdapter(adapter);   
	    lv.setOnItemClickListener(this);
	}
	
	
	@Override
	public void onBackPressed() {
		super.onBackPressed();
	}
	
	
	
	
	
	private void crearEntradas() {
	    items.add(new ObjetoEntradas(1, "1. Agregar Fragment UNO", "Mostrar fragment a traves de activity"));
	    items.add(new ObjetoEntradas(2, "2. Agregar Fragment DOS", "Mostrar fragment a traves de programacion"));
	    items.add(new ObjetoEntradas(3, "3. Gestionar Fragments", "Como cambiar entre fragments"));
	    items.add(new ObjetoEntradas(4, "4. Comunicar Fragments", "Como pasar valores entre fragments"));
	    items.add(new ObjetoEntradas(5, "5. Elementos de accion", "Como añadir elementos de accion a la ActionBar"));
	    items.add(new ObjetoEntradas(6, "6. MenuContextual", "Como crear un menu contextual"));
	}
	
	
	
	
	
/** INTERFACE ON ITEM CLICK LISTENER **/
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		switch (arg2) {
			case 0:
				startActivity(new Intent(this, AgregarFragmentUNO.class));
				break;
			case 1:
				startActivity(new Intent(this, AgregarFragmentDOS.class));
				break;
			case 2:
				startActivity(new Intent(this, GestionarFragments.class));
				break;
			case 3:
				startActivity(new Intent(this, ComunicarFragments.class));
				break;
			case 4:
				startActivity(new Intent(this, ElementosAccion.class));
				break;
			case 5:
				startActivity(new Intent(this, MenuContextual.class));
				break;
		}
	}
	
	
	
	
	
/** OBJETO PARA CADA ITEM DEL LIST VIEW **/
	
	public class ObjetoEntradas {
		
		private int id;
		private String titulo;
		private String descripcion;
		
		public ObjetoEntradas(int id, String titulo, String descripcion) {
			this.id = id;
			this.titulo = titulo;
			this.descripcion = descripcion;
		}
		
		public int getId() {return id;}
		public String getTitulo(){return titulo;}
		public String getDescripcion(){return descripcion;}
	}
	
	
	
	
	
/** ADAPTADOR PARA EL LISTVIEW DEL MENU PRINCIPAL **/
	
	public class EntradasAdapter extends BaseAdapter {
		
		protected Activity activity;
		protected ArrayList<ObjetoEntradas> items;
		
		public EntradasAdapter(Activity activity, ArrayList<ObjetoEntradas> items) {
			this.activity = activity;
			this.items = items;
		}
		
		public int getCount() {return items.size();}
		public Object getItem(int position) {return items.get(position);}
		public long getItemId(int position) {return items.get(position).getId();}
		
		public View getView(int position, View convertView, ViewGroup parent) {
			View vi = convertView;
			
	        if(vi == null) {
	        	LayoutInflater inflater = activity.getLayoutInflater();
	        	vi = inflater.inflate(R.layout.plantilla_listview, null);
	        }
	        
	        ObjetoEntradas item = items.get(position);
	             
	        TextView titulo = (TextView) vi.findViewById(R.id.titulo);
	        titulo.setText(item.getTitulo());
	             
	        TextView descripcion = (TextView) vi.findViewById(R.id.descripcion);
	        descripcion.setText(item.getDescripcion());
	     
	        return vi;
		}
	}
	
	
	
	
	
}