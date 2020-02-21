package com.example.roman.practicatec;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Roman on 7/12/2015.
 */

public class MainActivity extends Activity {

    private String Rivales[]=new String[]{"Alien","Predator","Scorpion","Subzero","Nemesis","Valentine",
            "Jason","Myers","Cage"};

    private Integer[] imgid={
            R.drawable.alien1,
            R.drawable.predator11,
            R.drawable.scorpion11,
            R.drawable.subzero11,
            R.drawable.nemesis11,
            R.drawable.valentine11,
            R.drawable.jason11,
            R.drawable.myers1,
            R.drawable.cage1
    };

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RivalListAdapter adapter=new RivalListAdapter(this,Rivales,imgid);
        lista=(ListView)findViewById(R.id.mi_lista);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Slecteditem = Rivales[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

                switch (position){

                    case 0:  Intent newActivity = new Intent(MainActivity.this, Alien.class);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity1 = new Intent(MainActivity.this, Predator.class);
                        startActivity(newActivity1);
                        break;
                    case 2:  Intent newActivity2 = new Intent(MainActivity.this, Scorpion.class);
                        startActivity(newActivity2);
                        break;
                    case 3:  Intent newActivity3 = new Intent(MainActivity.this, Subzero.class);
                        startActivity(newActivity3);
                        break;
                    case 4:  Intent newActivity4 = new Intent(MainActivity.this, Nemesis.class);
                        startActivity(newActivity4);
                        break;
                    case 5:  Intent newActivity5 = new Intent(MainActivity.this, Valentine.class);
                        startActivity(newActivity5);
                        break;
                    case 6:  Intent newActivity6 = new Intent(MainActivity.this, Jason.class);
                        startActivity(newActivity6);
                        break;

                }
            }
        });
    }
}