package com.example.seberatahu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class demam extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demam);

        String nama_tanaman[]={"Ginseng","Bawang merah","Kayu Putih","Air putih","Sambiloto"};
        int gambar_tanaman[]={R.drawable.ginseng,R.drawable.bawangmerah,R.drawable.kayuputih,R.drawable.airputih,R.drawable.sambiloto};
        String keterangan[]={"Ginseng merupakan tanaman herba asal Korea yang sudah mendunia. Tanaman yang memiliki efek antiradang, antibakteri, serta antivirus ini baik untuk meredakan demam. Selain itu, ginseng juga secara tradisional digunakan untuk mengatasi nyeri dan ejakulasi dini.Obat demam tradisional yang disebut di atas memang dianggap baik untuk meredakan demam. Namun, masih belum banyak penelitian medis yang dapat memastikan klaim-klaim tersebut. Apabila demam tak kunjung mereda meski sudah mencoba beberapa obat demam tradisional, disarankan untuk menggunakan obat demam yang dijual bebas di apotek, seperti paracetamol."
                ,"Salah satu cara menurunkan panas anak dengan bawang merah yakni dengan mencampurnya dengan minyak. Bawang merah dapat dijadikan obat demam anak, yakni dengan cara mencampurnya dengan minyak seperti kayu putih atau minyak telon. Anda dapat menyiapkan dua sampai tiga siung bawang merah, kemudian kupas kulit bawang merah tersebut. lalu, iris bawang merah namun tidak sampai terlalu tipis. Apabila sudah selesai, maka Anda dapat mencampurkannya ke dalam minyak yang sudah disiapkan. Anda harus pastikan bahwa minyak yang dicampurkan tidak terlalu banyak, sebab fungsi minyak disini hanyalah untuk memudahkan bawang merah dioleskan."
                ,"Minyak kayu putih memiliki sifat antioksidan, anti-inflamasi, dan penghilang rasa sakit yang dapat digunakan sebagai obat penurun panas alami, menurut Healthline. Minyak kayu putih juga dapat membantu melawan infeksi virus, bakteri, dan jamur. Minyak kayu putih juga dapat membantu meredakan gejala demam dengan membersihkan paru-paru dan hidung tersumbat. Khasiatnya dapat membantu membersihkan lendir dan dahak ekstra di dalam tubuh sehingga lebih mudah untuk bernapas dan meredakan batuk dan pilek."
                ,"Demam terjadi saat set pointpada pusat regulasi suhu tubuh (termoregulator) di otak (tepatnya di hipothalamus) meningkat. Penyebabnya, bisa karena pajanan suhu panas berlebih, infeksi virus atau bakteri, pengaruh imunisasi, hiperaktifitas kelenjar tiroid, efek samping obat, keganasan, gangguan hormon, gangguan peradangan, atau juga penyakit kronis lainnya. Saat set point ini meningkat, tubuh akan dipacu untuk meningkatkan metabolismenya, sehingga panas tubuh akan juga diproduksi berlebihan, lalu timbullah demam. Seringnya, demam ini tidak muncul sendiri, melainkan juga diikuti dengan berkeringat berlebih, detak jantung dan frekuensi napas meningkat, kulit memerah, nyeri kepala, nyeri otot dan sendi, lemas, mudah lelah, serta banyak lagi keluhan lainnya. Seperti telah disebutkan di atas, demam bisa membuat produksi keringat ikut meningkat. Imbasnya, Anda akan berisiko mengalami dehidrasi dan kehilangan banyak elektrolit. Bila kondisi ini tidak ditangani, maka gejala klinis yang muncul tdemam bisa semakin memburuk. Minum lebih banyak bisa membantu mengatasi kondisi ini. Dengan banyak minum, tubuh Anda pun akan menjadi lebih dingin, sehingga gejala lain yang kerap muncul bersamaan dengan demam pun bisa diredam, sehingga kondisi Anda pun akan lebih stabil. Kondisi ini sesungguhnya tidak hanya berlaku bagi air putih, melainkan juga variasi minum lainnya. Hanya saja, dengan mengkonsumsi air putih, risiko Anda untuk mengalami gangguan kesehatan lainnya, seperti peningkatan asam lambung, pun akan jauh berkurang. Kurang tepat sesungguhnya menyatakan bahwa minum bisa membantu menstabilkan suhu tubuh yang sedang demam. Namun, dengan banyak minum, memang keluhan yang muncul saat demam bisa jauh membaik."
                ,"Demam merupakan salah satu reaksi tubuh yang terjadi akibat peradangan. Kondisi ini biasanya terjadi ketika tubuh mengalami infeksi, misalnya karena bakteri atau virus. Daun sambiloto merupakan salah satu obat pereda demam alami. Ini berkat efek antiradang, antibakteri, dan antivirus yang terdapat di dalam tumbuhan tersebut."
        };
        listView = findViewById(R.id.List_obat);
        listDemam listDemam = new listDemam(this,nama_tanaman,gambar_tanaman,keterangan);
        listView.setAdapter(listDemam);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nm_tanaman = nama_tanaman[position].toString();
                int gbr_tanaman = gambar_tanaman[position];
                String ket = keterangan[position].toString();

                Toast.makeText(demam.this, ""+nm_tanaman.trim(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(demam.this,detailjeruk.class);
                intent.putExtra("namatanaman",nm_tanaman);
                intent.putExtra("gambartanaman",gbr_tanaman);
                intent.putExtra("keter",ket);


                startActivity(intent);
            }
        });
    }
}