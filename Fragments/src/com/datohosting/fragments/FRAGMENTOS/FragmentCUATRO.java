package com.datohosting.fragments.FRAGMENTOS;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.datohosting.fragments.R;

public class FragmentCUATRO extends Fragment {
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.fragment_cuatro, container, false);
		
		Bundle bundle = getArguments();
		String recuperada = bundle.getString("str");
		
		TextView texto = (TextView) view.findViewById(R.id.texto);
		texto.setText("Ha seleccionado la opcion:" + "\n\n" + recuperada);
		
		return view;
	}
	
	
	
}