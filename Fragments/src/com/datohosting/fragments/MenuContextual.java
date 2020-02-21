package com.datohosting.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

import com.datohosting.fragments.FRAGMENTOS.FragmentSEIS;

public class MenuContextual extends ActionBarActivity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_contextual);
		
		ActionBar actionBar = getSupportActionBar();
		actionBar.setTitle("EJ Fragment");
		actionBar.setSubtitle("6.Menu Contextual");
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		
		Fragment fragmentSEIS = new FragmentSEIS();
		
		FragmentManager FM = getSupportFragmentManager();
		FragmentTransaction FT = FM.beginTransaction();
		
		FT.replace(R.id.fragment_container, fragmentSEIS);
		FT.commit();
	}
}
