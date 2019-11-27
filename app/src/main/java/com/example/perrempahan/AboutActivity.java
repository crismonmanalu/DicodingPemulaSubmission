package com.example.perrempahan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_activity);

        ImageView PP = findViewById(R.id.tv_about);
        TextView nama = findViewById(R.id.tv_name);
        TextView email = findViewById(R.id.tv_email);
    }
}
