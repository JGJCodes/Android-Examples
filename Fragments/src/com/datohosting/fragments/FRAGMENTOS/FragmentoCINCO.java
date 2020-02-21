package com.datohosting.fragments.FRAGMENTOS;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.datohosting.fragments.R;

public class FragmentoCINCO extends Fragment {
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_cinco, container, false);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	}
	
	
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		inflater.inflate(R.menu.fm_cinco, menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		    case R.id.edit:
		        Toast.makeText(getActivity(), "EDITAR", Toast.LENGTH_SHORT).show();
		        return true;
		    case R.id.nuevo:
		        Toast.makeText(getActivity(), "NUEVO", Toast.LENGTH_SHORT).show();
		        return true;
	
		    default:
		        return super.onOptionsItemSelected(item);
	    }
	}


}
