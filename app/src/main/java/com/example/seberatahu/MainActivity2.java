package com.example.seberatahu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView nmmenu,hrgmenu,stmenu,totmenu;
    EditText jmlpsn;
    ImageView gambare;
    Button tombolbeli;

    String xnm = "nama"; //wadah penampung
    String hrg = "harga";
    String stn = "satuan";
    int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //deklarasi
        nmmenu = findViewById(R.id.nama_menu);
        hrgmenu = findViewById(R.id.harga_menu);
        stmenu = findViewById(R.id.satuan_menu);
        gambare = findViewById(R.id.gambar_menu);
        jmlpsn = findViewById(R.id.totalpesan);
        tombolbeli = findViewById(R.id.btn_pesan);

        Bundle bundle= getIntent().getExtras();
        //nama
        xnm = bundle.getString(xnm);
        nmmenu.setText(xnm);
        //harga
        hrg = bundle.getString(hrg);
        hrgmenu.setText(hrg);
        //satuan
        stn = bundle.getString(stn);
        stmenu.setText(stn);
        //image
        img = bundle.getInt(String.valueOf("image"));
        gambare.setImageResource(img);
    }

    public void panggil(View view) {
        int harga = Integer.parseInt(hrgmenu.getText().toString());
        int pesan = Integer.parseInt(jmlpsn.getText().toString());
        int harga_jual = harga*pesan;

        String fixharga = String.valueOf(harga_jual);
        String pesanbrg = String.valueOf(pesan);

        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);

        intent.putExtra("key",fixharga);
        intent.putExtra("jumlah",pesanbrg);

        startActivity(intent);
    }
}