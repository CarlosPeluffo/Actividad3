package com.peluffo.actividad3;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.peluffo.actividad3.modelo.Pelicula;

import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.ViewHolder> {
    private List<Pelicula> lista ;
    private Context context;
    private LayoutInflater layoutInflater;

    public PeliculaAdapter(List<Pelicula> lista, Context context, LayoutInflater layoutInflater) {
        this.lista = lista;
        this.context = context;
        this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public PeliculaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = layoutInflater.inflate(R.layout.item_pelicula, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       holder.tvTitulo.setText(lista.get(position).getTitulo());
       holder.tvSinopsis.setText(lista.get(position).getSinopsis());
       holder.portada.setImageResource(lista.get(position).getAfiche());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvTitulo, tvSinopsis;
        private ImageView portada;
        private Button btDetalle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvSinopsis = itemView.findViewById(R.id.tvSinopsis);
            portada = itemView.findViewById(R.id.ivFoto);
            btDetalle = itemView.findViewById(R.id.btDetalle);

            btDetalle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int posicion = getAdapterPosition();
                    Log.d("Mensaje", posicion +"");
                    Intent intent = new Intent(context, Descripcion.class);
                    intent.putExtra("Item", posicion );
                    context.startActivity(intent);
                }
            });
        }
    }
}
