package com.example.perrempahan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
public class DetailRempahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_rempah);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Rempah rempah = getIntent().getParcelableExtra("key");

        ImageView imageView = findViewById(R.id.img_item_photo);
        TextView nama = findViewById(R.id.tv_item_nama);
        TextView detail = findViewById(R.id.tv_detail);

        Glide.with(this).load(rempah.getPhoto()).into(imageView);
        nama.setText(rempah.getNama_rempah());
        detail.setText(rempah.getDetail());
    }
}