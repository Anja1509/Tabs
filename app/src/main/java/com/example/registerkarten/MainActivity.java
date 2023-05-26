package com.example.registerkarten;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.tabs.TabLayout;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    protected void initViews() {
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Obst&Gemüse"));
        tabLayout.addTab(tabLayout.newTab().setText("Milchprodukte"));
        tabLayout.addTab(tabLayout.newTab().setText("Anderes"));
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
    }
}