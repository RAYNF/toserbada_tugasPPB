package com.example.seberatahu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class pusing extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pusing);
        String nama_tanaman[]={"Teh","Mint","Kayu manis"};
        int gambar_tanaman[]={R.drawable.teh,R.drawable.mint,R.drawable.kayumanis};
        String keterangan[]={"Kafein yang terkandung dalam minuman kopi dan teh juga dapat dikonsumsi sebagai obat alami untuk meringankan sakit kepala. Meski begitu, pastikan untuk mengonsumsi kafein dalam batas normal, karena jika kebanyakan justru dapat menyebabkan sakit kepala. Selain itu, terlalu sering mengonsumsi kafein dan langsung berhenti mengonsumsinya juga bisa memicu gejala putus zat kafein, lalu menyebabkan sakit kepala."
                ,"Pepermin memiliki bahan aktif, yaitu mentol, yang dipercaya dapat meredakan sakit kepala. Anda bisa mendapatkan manfaat pepermin yang satu ini dengan berbagai cara. Ada yang dimanfaatkan sebagai minuman teh atau ada pula yang berbentuk minyak oles untuk dibalurkan pada kulit.."
                ,"Kayu manis diketahui mengandung banyak antioksidan, sidat anti inflamasi dan efektif mengobati sakit kepala. Kayu manis juga berguna untuk melindungi kesehatan jantung. Cara membuatnya, giling beberapa batang kayu manis lalu tambahkan air ke dalamnya hingga mengental. Oleskan pada dahi dan diamkan selama 30 menit. Jangan lupa, setelahnya, cuci dahi hingga bersih dengan air hangat."
        };

        listView = findViewById(R.id.List_obat);
        listpusing listpusing = new listpusing(this,nama_tanaman,gambar_tanaman,keterangan);
        listView.setAdapter(listpusing);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              String nm_tanaman = nama_tanaman[position].toString();
              int gbr_tanaman=gambar_tanaman[position];
              String ket = keterangan[position].toString();

                Toast.makeText(pusing.this, ""+nm_tanaman.trim(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(pusing.this,detailjeruk.class);
                intent.putExtra("namatanaman",nm_tanaman);
                intent.putExtra("gambartanaman",gbr_tanaman);
                intent.putExtra("keter",ket);


                startActivity(intent);
            }
        });
    }
}