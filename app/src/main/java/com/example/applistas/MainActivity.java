package com.example.applistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    private ArrayList<String> ciclos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.lista);
        ciclos = new ArrayList<String>();
        ciclos.add("Ciclo 1");
        ciclos.add("Ciclo 2");
        ciclos.add("Ciclo 3");
        ciclos.add("Ciclo 4 - Moviles");
        ciclos.add("Ciclo 4 - WEB");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ciclos);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "has pulsado: " +ciclos.get(position), Toast.LENGTH_LONG).show();

            }
        });

    }
}