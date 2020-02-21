package com.datohosting.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.datohosting.fragments.FRAGMENTOS.FragmentDOS;
import com.datohosting.fragments.FRAGMENTOS.FragmentUNO;

public class GestionarFragments extends ActionBarActivity {
	
	
	private boolean bol = false;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.gestionar_fragments);
		
		ActionBar actionBar = getSupportActionBar();
		actionBar.setTitle("EJ Fragment");
		actionBar.setSubtitle("3.Gestionar Fragments");
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		
		final Fragment fragmentUNO = new FragmentUNO();
		final Fragment fragmentDOS = new FragmentDOS();
		
		
		Button boton = (Button) findViewById(R.id.boton);
		boton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
				
				if (bol) {
					transaction.replace(R.id.fragment_container, fragmentUNO);
				} else {
					transaction.replace(R.id.fragment_container, fragmentDOS);
				}
				
				transaction.addToBackStack(null);

				transaction.commit();
				
				bol = (bol) ? false : true;
			}
		});
		
	}
	
	
	
	
}