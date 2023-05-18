package com.example.seberatahu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView pesan,total;
    ImageView gambar;

    int img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //deklarasi
        pesan = findViewById(R.id.jmlhpesan);
        total = findViewById(R.id.totalharga);
        gambar = findViewById(R.id.gambar1);

        //gambar
        Bundle bundle = getIntent().getExtras();

        img1 = bundle.getInt(String.valueOf("img"));
        gambar.setImageResource(img1);


        Intent receiver = getIntent();

        //total harga
        String received = receiver.getStringExtra("key");
        total.setText(received);
        //jumlah pesan
        String pesans = receiver.getStringExtra("jumlah");
        pesan.setText(pesans);



    }
}