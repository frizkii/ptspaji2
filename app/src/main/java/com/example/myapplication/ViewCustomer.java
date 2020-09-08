package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ViewCustomer extends AppCompatActivity {
    RecyclerView rcy;
    List<String> nama;
    List<String> email;
    List<String> nohp;
    List<String> alamat;
    List<String> ktp;

    Adapter2 adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_customer);

        rcy = findViewById(R.id.dataList2);

        nama = new ArrayList<>();
        email = new ArrayList<>();
        nohp = new ArrayList<>();
        alamat = new ArrayList<>();
        ktp = new ArrayList<>();

        nama.add("name1");

        email.add("email1");

        nohp.add("05897549");

        alamat.add("jkhd");

        ktp.add("hjsd");

        nama.add("name2");

        email.add("email2");

        nohp.add("05897549");

        alamat.add("jkhd");

        ktp.add("hjsd");

        adapter = new Adapter2(this,nama,email,nohp,alamat,ktp);
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.HORIZONTAL,false);
//        rcy.setLayoutManager(gridLayoutManager);
//        rcy.setAdapter(adapter);
        RecyclerView recyclerView = findViewById(R.id.dataList2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter2(this,nama,email,nohp,alamat,ktp);

        recyclerView.setAdapter(adapter);
    }

}