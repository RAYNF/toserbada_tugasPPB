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

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.myViewHolder> {

    ArrayList<modelMenu> arrayList;
    Context context;

    public MenuAdapter(ArrayList<modelMenu> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public MenuAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.format_menu,parent,false);


        return new MenuAdapter.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.myViewHolder holder,int position) {

        holder.Cnamamenu.setText(arrayList.get(position).nama_menu);
        holder.Chargamenu.setText(arrayList.get(position).harga_menu);
        holder.Csatuanmenu.setText(arrayList.get(position).satuan_menu);
        holder.Cgambarmenu.setImageResource(arrayList.get(position).gambar_menu);
        holder.relatiview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),MainActivity2.class);
                intent.putExtra("nama",arrayList.get(position).nama_menu);
                intent.putExtra("harga",arrayList.get(position).harga_menu);
                intent.putExtra("satuan",arrayList.get(position).satuan_menu);
                intent.putExtra("image",arrayList.get(position).gambar_menu);

                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView Cnamamenu,Csatuanmenu,Chargamenu;
        ImageView Cgambarmenu;
        RelativeLayout relatiview;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            Cnamamenu = itemView.findViewById(R.id.namamenu);
            Csatuanmenu = itemView.findViewById(R.id.satuan);
            Chargamenu = itemView.findViewById(R.id.hargamenu);
            Cgambarmenu = itemView.findViewById(R.id.gambarmenu);
            relatiview = itemView.findViewById(R.id.relatif01);
        }
    }
}
