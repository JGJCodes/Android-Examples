package com.datohosting.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

import com.datohosting.fragments.FRAGMENTOS.FragmentUNO;

public class AgregarFragmentDOS extends ActionBarActivity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.agregar_fragment_dos);
		
		ActionBar actionBar = getSupportActionBar();
		actionBar.setTitle("EJ Fragment");
		actionBar.setSubtitle("2.Agregar Fragment DOS");
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		
		FragmentManager FM = getSupportFragmentManager();
		FragmentTransaction FT = FM.beginTransaction();
		
		Fragment fragment = new FragmentUNO();
		FT.add(R.id.fragment_container, fragment);
		FT.commit();
		
	}
	
	
	
	
}