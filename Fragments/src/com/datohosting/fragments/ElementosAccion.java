package com.datohosting.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

import com.datohosting.fragments.FRAGMENTOS.FragmentoCINCO;

public class ElementosAccion extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.elementos_accion);
		
		ActionBar actionBar = getSupportActionBar();
		actionBar.setTitle("EJ Fragment");
		actionBar.setSubtitle("5.Elementos de accion");
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		FragmentoCINCO fragment = new FragmentoCINCO();
		
		FragmentTransaction FT = getSupportFragmentManager().beginTransaction();
		FT.add(R.id.fragment_container, fragment);
		FT.commit();
	}
}
