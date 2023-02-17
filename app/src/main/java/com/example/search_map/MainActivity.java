package com.example.search_map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button showMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMap = findViewById(R.id.showMap);

        showMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });

    }
}