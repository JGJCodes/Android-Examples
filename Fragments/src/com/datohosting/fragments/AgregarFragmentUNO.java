package com.datohosting.fragments;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

public class AgregarFragmentUNO extends ActionBarActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.agregar_fragment_uno);
		
		ActionBar actionBar = getSupportActionBar();
		actionBar.setTitle("EJ Fragment");
		actionBar.setSubtitle("1.Agregar Fragment UNO");
		actionBar.setDisplayHomeAsUpEnabled(true);
	}
	
}
