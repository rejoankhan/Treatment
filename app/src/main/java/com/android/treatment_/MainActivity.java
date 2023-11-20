package com.android.treatment_;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.material.button.MaterialButtonToggleGroup;

import soup.neumorphism.NeumorphButton;

public class MainActivity extends AppCompatActivity {
    NeumorphButton neuDoctor, neuHospital,neuAmbulance;
    AdView adViewN;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        adViewN = findViewById(R.id.adViewN);
        AdRequest adRequestBanner = new AdRequest.Builder().build();
        adViewN.loadAd(adRequestBanner);



        neuDoctor = findViewById(R.id.neuDoctor);
        neuHospital = findViewById(R.id.neuHospital);
        neuAmbulance = findViewById(R.id.newAmbulance);

        // Find the TextView by its ID
        TextView marqueeTextView = findViewById(R.id.marqueeTextView);

        // Enable the marquee effect
        marqueeTextView.setSelected(true);

        neuDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent docintent = new Intent(MainActivity.this,DoctorActivity.class);
                startActivity(docintent);


            }
        });
        neuHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hosintent = new Intent(MainActivity.this, ByDiseaseActivity.class);
                startActivity(hosintent);
            }
        });
        neuAmbulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ambuintent = new Intent(MainActivity.this,AmbulanceActivity.class);
                startActivity(ambuintent);
            }
        });





    }
}