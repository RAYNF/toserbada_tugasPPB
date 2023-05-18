package com.example.seberatahu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class grid_adapter extends RecyclerView.Adapter<grid_adapter.myViewHolder> {

    ArrayList<modelMenu> arrayList;
    Context context;

    public  grid_adapter(ArrayList<modelMenu> arrayList,Context context){
        this.arrayList = arrayList;
        this.context = context;

    }

    @Override
    public grid_adapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.format_menugrid,parent,false);

        return new grid_adapter.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull grid_adapter.myViewHolder holder, int position) {
    holder.Cnamamenu.setText(arrayList.get(position).nama_menu);
    holder.Chargamenu.setText(arrayList.get(position).nama_menu);
    holder.Csatuanmenu.setText(arrayList.get(position).satuan_menu);
    holder.Cgambarmenu.setImageResource(arrayList.get(position).gambar_menu);

    }

    @Override
    public int getItemCount() {return arrayList.size();}


    public class myViewHolder extends RecyclerView.ViewHolder{
        TextView Cnamamenu,Csatuanmenu,Chargamenu;
        ImageView Cgambarmenu;
        RelativeLayout relatiview;

        public myViewHolder (View itemView) {
            super(itemView);

            Cnamamenu = itemView.findViewById(R.id.namamenu);
            Csatuanmenu = itemView.findViewById(R.id.satuan);
            Chargamenu = itemView.findViewById(R.id.hargamenu);
            Cgambarmenu = itemView.findViewById(R.id.gambarmenu);
            relatiview = itemView.findViewById(R.id.relatif01);
        }
    }
}
