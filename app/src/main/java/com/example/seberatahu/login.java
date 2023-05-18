package com.example.seberatahu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    Button btnbtk,btndemam,btnpusing,btndiare,btnrengasdengklok,btnbintar,btnemail,btnnotifikasi,btnseting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnbtk=findViewById(R.id.batuk);
        btndemam=findViewById(R.id.demam);
        btnpusing=findViewById(R.id.pusing);
        btndiare=findViewById(R.id.diare);
        btnrengasdengklok = findViewById(R.id.rengasdengklok);
        btnbintar = findViewById(R.id.bintaro);
        btnemail = findViewById(R.id.email);
        btnnotifikasi = findViewById(R.id.notifikasi);
        btnseting = findViewById(R.id.seting);

        btnbtk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,batuk.class);
                startActivity(intent);
            }

        });
        btndemam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,demam.class);
                startActivity(intent);
            }
        });
        btnpusing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,pusing.class);
                startActivity(intent);
            }
        });
        btndiare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,diare.class);
                startActivity(intent);
            }
        });
        btnrengasdengklok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,rengasdengklok.class);
                startActivity(intent);

            }
        });
        btnbintar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,bintar.class);
                startActivity(intent);
            }
        });
        btnemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,biodata.class);
                startActivity(intent);
            }
        });
        btnnotifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,notifikasi.class);
                startActivity(intent);
            }
        });
        btnseting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,notifikasi.class);
                startActivity(intent);
            }
        });
    }
}