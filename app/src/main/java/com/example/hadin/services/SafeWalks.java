package com.example.hadin.services;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SafeWalks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safe_walks);
    }
    public void link (View view) {
        Intent openWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://police.illinois.edu/services/safewalks-saferides/"));
        startActivity(openWeb);
    }
    public void call(View view) {
        //----------------------when the call button is pressed-----------------------------
        final int REQUEST_PHONE_CALL = 1;
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:2173331216"));
        //-----------------checks for permission before placing the call--------------------
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(ContextCompat.checkSelfPermission(SafeWalks.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(SafeWalks.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
            }else{
                //-------------------------------places the call-----------------------------------
                startActivity(callIntent);
            }
        }
    }
}
