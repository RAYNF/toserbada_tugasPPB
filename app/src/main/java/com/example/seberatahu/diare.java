package com.example.seberatahu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class diare extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diare);
        String nama_tanaman[]={"jahe","jeruk nipis","Madu","Garam","Bawang putih"};
        int gambar_tanaman[]={R.drawable.jahe,R.drawable.jeruk,R.drawable.madu,R.drawable.garam,R.drawable.bawangputih};
        String keterangan[]={"Jahe sudah lama dikenal masyarakat sebagai obat herbal. Salah satu keluhan kesehatan yang bisa diatasi menggunakan jahe adalah batuk. Mengonsumsi jahe membuat otot-otot pada saluran napas menjadi rileks. Jahe juga memiliki sifat anti inflamasi yang mampu mengurangi peradangan dan pembengkakan di tenggorokan. Kamu bisa mengonsumsi air rebusan jahe untuk mengurangi batuk yang kamu alami."
                ,"Salah satu bahan alami yang biasa diandalkan sebagai obat alami untuk mengatasi batuk adalah jeruk nipis. Buah yang memiliki nama latin Citrus aurantifolia ini mengandung minyak atsiri dan zat lain yang mampu melemaskan otot-otot saluran pernapasan. Jeruk nipis juga dipercaya berkhasiat mengatasi berbagai gangguan kesehatan lain yang mungkin muncul bersamaan dengan batuk.Dalam sebuah studi di African Journal of Tradisional diketahui bahwa jeruk nipis mengandung berbagai zat antimikroba yang bisa membantu proses pemulihan tubuh dari infeksi kuman penyakit. Oleh karena itu, jeruk nipis tidak hanya bisa meredakan batuk. Gejala lain yang menyertai batuk seperti, demam, perih dan gatal di tenggorokan juga dapat dihilangkan dengan jeruk nipis. Kandungan antimikroba pada jerus nipis juga tetap berfungsi efektif sekalipun telah dilarutkan ke dalam air. Manfaat kesehatan jeruk nipis ini juga diketahui bisa bekerja lebih baik apabila pemakaiannya dikombinasikan dengan obat herbal lainnya, yaitu bahan-bahan alami yang telah digunakan sejak lama sebagai obat-obatan."
                ,"Madu menjadi salah satu bahan alami yang bisa membantu kamu mengatasi batuk. Bahkan, penelitian dalam jurnal Archives of Pediatrics and Adolescent Medicines, menunjukkan hasil penggunaan madu lebih efektif mengatasi batuk dibandingkan obat-obatan yang bisa ditemukan di apotek. Kamu bisa membuat campuran teh dengan madu dengan mencampurkan dua sendok teh madu ke dalam teh hangat. Konsumsi minuman ini sekali atau dua kali dalam sehari."
                ,"Garam bisa menjadi obat batuk alami yang mudah didapatkan di rumah. Berkumur dengan air garam hangat bisa membantu mencegah pertumbuhan bakteri yang menginfeksi tenggorokan. Cara tradisional ini juga bisa membantu mengencerkan dahak yang menggumpal di belakang tenggorokan, sehingga batuk lebih reda. Untuk membuat obat batuk berdahak dari larutan garam, masukan 1/4 hingga 1/2 sendok teh garam ke dalam 250 ml air hangat, lalu aduk hingga larut. Kemudian berkumurlah menggunakan larutan ini setiap tiga jam sekali selama 3-4 kali dalam sehari. Jika ingin menggunakan bahan tradisional ini sebagai obat batuk untuk anak, pastikan Anda memberitahu si kecil cara berkumur yang benar agar larutan tidak tertelan."
                ,"Bawang putih merupakan salah satu obat alami batuk berdahak yang paling mudah diperoleh. Sifat antimikroba yang terdapat dalam bawang putih mampu menghentikan infeksi ataupun iritasi yang menimbulkan dahak berlebih. Hal itu berkat senyawa allicin yang dapat membasmi bakteri dan virus di dalam tenggorokan. Selain dimakan, Anda juga bisa menghirup aroma menyengat dari bawang putih sebagai obat batuk berdahak alami. Alternatif lain, Anda bisa membuat ramuan obat tradisional batuk dengan mencampur bawang putih halus, madu, serta teh. Minumlah larutan obat batuk ini paling tidak dua kali sehari untuk meredakan batuk dan rasa sakit di tenggorokan."
        };

        listView = findViewById(R.id.List_obat);
        listdiare listdiare = new listdiare(this,nama_tanaman,gambar_tanaman,keterangan);
        listView.setAdapter(listdiare);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String nm_tanaman = nama_tanaman[position].toString();
                int gbr_tanaman = gambar_tanaman[position];
                String ket = keterangan[position].toString();

                Toast.makeText(diare.this, ""+nm_tanaman.trim(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(diare.this,detailjeruk.class);
                intent.putExtra("namatanaman",nm_tanaman);
                intent.putExtra("gambartanaman",gbr_tanaman);
                intent.putExtra("keter",ket);


                startActivity(intent);
            }

        });
    }
}