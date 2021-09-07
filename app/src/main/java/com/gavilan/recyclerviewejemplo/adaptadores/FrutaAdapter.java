package com.gavilan.recyclerviewejemplo.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gavilan.recyclerviewejemplo.R;
import com.gavilan.recyclerviewejemplo.model.Fruta;

import java.util.ArrayList;


public class FrutaAdapter extends RecyclerView.Adapter<FrutaAdapter.ViewHolder> {
    //String[] arrayFrutas;
    ArrayList<Fruta>  arrayFrutas;
    // declarar constructor

    public FrutaAdapter(ArrayList<Fruta> listaACargar){
        this.arrayFrutas = listaACargar;
    }

    @NonNull
    @Override
    public FrutaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fruta,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FrutaAdapter.ViewHolder holder, int position) {
        holder.cargarDatos(arrayFrutas.get(position));

    }

    @Override
    public int getItemCount() {
        return arrayFrutas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombreFruta, txtPrecioFruta;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombreFruta = itemView.findViewById(R.id.txtNombreFruta);
            txtPrecioFruta = itemView.findViewById(R.id.txtPrecioFruta);
        }

        public void cargarDatos(Fruta fruta){
            txtNombreFruta.setText(fruta.getNombre());
            txtPrecioFruta.setText("$"+fruta.getPrecio_unitario());
        }

    }
}
