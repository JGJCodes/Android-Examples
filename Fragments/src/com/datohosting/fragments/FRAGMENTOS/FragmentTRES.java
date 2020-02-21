package com.datohosting.fragments.FRAGMENTOS;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.datohosting.fragments.R;

public class FragmentTRES extends ListFragment {
	
	private String[] valores = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
	private OnArticuloSelectedListener listener;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tres, container, false);
    }
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, valores));
    }
	
    
	
	
	
	public interface OnArticuloSelectedListener {
        public void onArticuloSelected(String str);
    }
	
	
	@Override
	public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
        	listener = (OnArticuloSelectedListener) activity;
        } catch (ClassCastException e) {}
    }
	
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		listener.onArticuloSelected(valores[position]);
	}
	
	
	
}