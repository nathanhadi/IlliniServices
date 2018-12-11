package com.example.hadin.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button safeRides;
    private Button safeWalks;
    private Button mcKinley;
    private Button idCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        safeRides = findViewById(R.id.button7);
        safeWalks = findViewById(R.id.button8);
        mcKinley = findViewById(R.id.button9);
        idCenter = findViewById(R.id.button10);

        safeRides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSafeRides();
            }
        });
        safeWalks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSafeWalks();
            }
        });
        mcKinley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMcKinley();
            }
        });
        idCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIDCenter();
            }
        });
    }

    public void openSafeRides() {
        Intent intent = new Intent(this, SafeRides.class);
        startActivity(intent);
    }
    public void openSafeWalks() {
        Intent intent = new Intent(this, SafeWalks.class);
        startActivity(intent);
    }
    public void openMcKinley() {
        Intent intent = new Intent(this, McKinley.class);
        startActivity(intent);
    }
    public void openIDCenter() {
        Intent intent = new Intent(this, IDCenter.class);
        startActivity(intent);
    }
}
