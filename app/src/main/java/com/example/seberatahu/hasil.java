package com.example.seberatahu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hasil extends AppCompatActivity {
    TextView namaterima,nomerterima,emailterima;
    String nmKunci = "nama", nmrKunci = "nomer",emlKunci = "email";

    String nmtampung;
    String nmrtampung;
    String emltampung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        namaterima = findViewById(R.id.namakirim);
        nomerterima = findViewById(R.id.nomerkirim);
        emailterima = findViewById(R.id.emailkirim);

        Bundle bundle = getIntent().getExtras();

        nmtampung=bundle.getString("nama");
        nmrtampung=bundle.getString("nomer");
        emltampung = bundle.getString("email");

        namaterima.setText(nmtampung);
        nomerterima.setText(nmrtampung);
        emailterima.setText(emltampung);

    }

    public void belanja(View view) {
        Intent intent = new Intent(hasil.this,email.class);
        startActivity(intent);
    }
}