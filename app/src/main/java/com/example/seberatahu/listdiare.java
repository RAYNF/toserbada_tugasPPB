package com.example.seberatahu;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class listdiare extends ArrayAdapter {
    String namatanaman[];
    String keterangan[];
    int gambar_buah[];
    Activity activity;
    public listdiare(diare activity, String[] nama_tanaman, int[] gambar_tanaman, String[] keterangan) {
        super(activity,R.layout.activity_list_item,nama_tanaman);
        this.namatanaman = nama_tanaman;
        this.keterangan=keterangan;
        this.gambar_buah=gambar_tanaman;
        this.activity=activity;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater =activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_list_item,null);
        ImageView gambare;
        TextView nama_buah;
        gambare = v.findViewById(R.id.gambar_tanaman);
        nama_buah= v.findViewById(R.id.nama_tanaman);
        gambare.setImageResource(gambar_buah[position]);
        nama_buah.setText(namatanaman[position]);
        return v;
    }
}
