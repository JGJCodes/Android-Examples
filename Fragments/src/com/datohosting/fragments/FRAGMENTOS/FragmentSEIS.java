package com.datohosting.fragments.FRAGMENTOS;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.datohosting.fragments.R;

public class FragmentSEIS extends Fragment {
	
    private final int MENU_EDITAR = 1;
    private final int MENU_NUEVO = 2;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.fragment_seis, container, false);
		
		registerForContextMenu(view.findViewById(R.id.boton));
		
		return view;
	}
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		menu.add(Menu.NONE, MENU_EDITAR, Menu.NONE, "EDITAR");
        menu.add(Menu.NONE, MENU_NUEVO, Menu.NONE, "NUEVO");
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case MENU_EDITAR:
				Toast.makeText(getActivity(), "EDITAR", Toast.LENGTH_SHORT).show();
				break;
			case MENU_NUEVO:
				Toast.makeText(getActivity(), "NUEVO", Toast.LENGTH_SHORT).show();
				break;
	
			default:
				return super.onContextItemSelected(item);
		}
		return false;
		
	}
	
}
