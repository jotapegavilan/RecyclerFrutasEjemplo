package com.gavilan.recyclerviewejemplo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.gavilan.recyclerviewejemplo.adaptadores.FrutaAdapter;
import com.gavilan.recyclerviewejemplo.model.Fruta;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerFrutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerFrutas = findViewById(R.id.recyclerFrutas);

     //   String[] frutitas = {"Naranja","Manzana","Pera","Melón",
     //           "Lima","Frutilla","Durazno","Coco"};

        ArrayList<Fruta> frutaArrayList = new ArrayList<>();
        Fruta f1 = new Fruta("Naranja",350);
        Fruta f2 = new Fruta("Manzana",300);
        Fruta f3 = new Fruta("Pera",330);
        Fruta f4 = new Fruta("Melón",1000);
        Fruta f5 = new Fruta("Frutilla",150);
        Fruta f6 = new Fruta("Durazno",400);
        // Agregamos las frutas al arrayList
        frutaArrayList.add(f1);
        frutaArrayList.add(f2);
        frutaArrayList.add(f3);
        frutaArrayList.add(f4);
        frutaArrayList.add(f5);
        frutaArrayList.add(f6);

        recyclerFrutas.setLayoutManager(new LinearLayoutManager(this));
        FrutaAdapter adapter = new FrutaAdapter(frutaArrayList);
        recyclerFrutas.setAdapter(adapter);
    }
}