package com.example.seberatahu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class biodata extends AppCompatActivity {
    EditText edtnama,edtnomer,edtemail;
    Button btnkirim,btnkeluar;

    private String KEY_NAMA ="NAMA";
    private String KEY_NOMER = "NIM";
    private String KEY_EMAIL = "EMAIL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        //
        edtnama = findViewById(R.id.editNama);
        edtnomer = findViewById(R.id.editNomer);
        edtemail = findViewById(R.id.editEmail);


        btnkirim = findViewById(R.id.buttonKirim);
        btnkeluar = findViewById(R.id.buttonKeluar);

        btnkeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    public void kirimdata(View view) {
        String isinama=edtnama.getText().toString();
        String isinomer=edtnomer.getText().toString();
        String isiemail=edtemail.getText().toString();

        Intent intent= new Intent(biodata.this,hasil.class);
        intent.putExtra("nama",isinama);
        intent.putExtra("nomer",isinomer);
        intent.putExtra("email",isiemail);

        startActivity(intent);
    }
}