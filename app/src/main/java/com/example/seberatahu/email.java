package com.example.seberatahu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class email extends AppCompatActivity {

    ArrayList<modelMenu>menuArrayList=new ArrayList<>();
    RecyclerView recyclerView;

    String nm_menu[]={"jahe","kayu manis","kayu putih"};
    String sat_menu[]={"1 kg","250 gram","250 gram"};
    String hrg_menu[]={"14000","10000","12000"};
    int image[]={R.drawable.jahe,R.drawable.kayumanis,R.drawable.kayuputih};

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        recyclerView = findViewById(R.id.recycleview_menu);
        bacadata_menu();
        //tampil_listview();

        MenuAdapter menuAdapter = new MenuAdapter(menuArrayList,this);
        recyclerView.setAdapter(menuAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(email.this));


    }

    private void bacadata_menu() {
        for(int i = 0;i< nm_menu.length;i++){
            menuArrayList.add(new modelMenu(nm_menu[i],hrg_menu[i],sat_menu[i],image[i]));

        }
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menupil,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.item1){
            Toast.makeText(this,"anda memilih listview",Toast.LENGTH_SHORT);
            tampil_listview();
        }else {
            Toast.makeText(this,"anda memilih gridview",Toast.LENGTH_SHORT);
            tampil_gridview();
        }
        return super.onOptionsItemSelected(item);
    }

    private void tampil_gridview() {
        grid_adapter grid_adapter = new grid_adapter(menuArrayList,this);
        recyclerView.setAdapter(grid_adapter);
       // recyclerView.setAdapter(grid_adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(email.this,2));
    }

    private void tampil_listview() {
        MenuAdapter menuAdapter = new MenuAdapter(menuArrayList,this);
        recyclerView.setAdapter(menuAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(email.this));
    }

}