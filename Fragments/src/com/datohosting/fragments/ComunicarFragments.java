package com.datohosting.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

import com.datohosting.fragments.FRAGMENTOS.FragmentCUATRO;
import com.datohosting.fragments.FRAGMENTOS.FragmentTRES;
import com.datohosting.fragments.FRAGMENTOS.FragmentTRES.OnArticuloSelectedListener;

public class ComunicarFragments extends ActionBarActivity implements OnArticuloSelectedListener {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.comunicar_fragments);
		
		ActionBar actionBar = getSupportActionBar();
		actionBar.setTitle("EJ Fragment");
		actionBar.setSubtitle("4.Comunicar Fragments");
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		Fragment fragmentTRES = new FragmentTRES();
		
		FragmentManager FM = getSupportFragmentManager();
		FragmentTransaction FT = FM.beginTransaction();
		
		FT.replace(R.id.fragment_container, fragmentTRES);
		FT.commit();
	}

	
	public void onArticuloSelected(String str) {
		
		Fragment fragmentCUATRO = new FragmentCUATRO();
		
		Bundle args = new Bundle();
        args.putString("str", str);
        fragmentCUATRO.setArguments(args);
		
		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		
		transaction.replace(R.id.fragment_container, fragmentCUATRO);
		transaction.addToBackStack(null);

		transaction.commit();
	}
	
	
}
