package com.example.seberatahu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detailcerita extends AppCompatActivity {
    ImageView gambar_buah_masuk;
    TextView nama_buah_masuk,ket_buah_masuk;

    String nm_kunci = "namatanaman";
    String ket_kunci = "keter";
    int gambartanaman;

    String namabuahe,ketbuahe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailcerita);

        gambar_buah_masuk = findViewById(R.id.gambarterima);
        nama_buah_masuk = findViewById(R.id.nm_tanaman);
        ket_buah_masuk = findViewById(R.id.keterangantanaman);

        Bundle bundle = getIntent().getExtras();
        gambartanaman = bundle.getInt(String.valueOf("gambartanaman"));
        namabuahe = bundle.getString("namatanaman");
        ketbuahe = bundle.getString("keter");

        gambar_buah_masuk.setImageResource(gambartanaman);
        nama_buah_masuk.setText(namabuahe);
        ket_buah_masuk.setText(ketbuahe);
    }
}