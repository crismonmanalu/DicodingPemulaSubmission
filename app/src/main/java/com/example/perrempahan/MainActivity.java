package com.example.perrempahan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvRempah;
    private ArrayList<Rempah>list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvRempah = findViewById(R.id.rv_list);
        rvRempah.setHasFixedSize(true);

        //list = new ArrayList<>();
        list.addAll(DataRempah.getListData());
        showRecylerCardView();
    }

    private void showRecylerCardView() {
        rvRempah.setLayoutManager(new LinearLayoutManager(this));
        ListRempahAdapter listRempahAdapter = new ListRempahAdapter(this);
        listRempahAdapter.setListRempah(list);
        rvRempah.setAdapter(listRempahAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.about_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        switch (itemId){
            case R.id.action_setting:
                Intent about = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(about);
            break;
        }
    }
}
