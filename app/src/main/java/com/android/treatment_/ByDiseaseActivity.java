package com.android.treatment_;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphButton;

public class ByDiseaseActivity extends AppCompatActivity {
    NeumorphButton disBrain,disGyn,disEye,disHeart,disOrtho,disLiver,disOthers,
            disSkin,disNeck,disMedicine,disChild;
    private InterstitialAd mInterstitialAd;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_by_disease);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });
        AdRequest adRequest = new AdRequest.Builder().build();





        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.i(TAG, "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d(TAG, loadAdError.toString());
                        mInterstitialAd = null;
                    }
                });


        disBrain =findViewById(R.id.disBrain);
        disGyn =findViewById(R.id.disGyn);
        disEye =findViewById(R.id.disEye);
        disHeart =findViewById(R.id.disHeart);
        disOrtho =findViewById(R.id.disOrtho);
        disLiver =findViewById(R.id.disLiver);
        disSkin =findViewById(R.id.disSkin);
        disNeck =findViewById(R.id.disNeck);
        disMedicine =findViewById(R.id.disMedicine);
        disOthers = findViewById(R.id.disOthers);
        disChild = findViewById(R.id.disChild);

        disOthers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(ByDiseaseActivity.this);
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");
                }
                Intent intent = new Intent(ByDiseaseActivity.this, DisOthersActivity.class);
                startActivity(intent);
                
            }
        });
        disChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(ByDiseaseActivity.this);
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");
                }
                Intent intent = new Intent(ByDiseaseActivity.this,DisChildActivity.class);
                startActivity(intent);
            }
        });


        disBrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(ByDiseaseActivity.this);
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");
                }
                Intent brainIntent = new Intent(ByDiseaseActivity.this,DisBrainActivity.class);
                startActivity(brainIntent);

            }
        });
        disGyn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(ByDiseaseActivity.this);
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");
                }
                Intent gynIntent = new Intent(ByDiseaseActivity.this,DisGyneeActivity.class);
                startActivity(gynIntent);

            }
        });
        disEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(ByDiseaseActivity.this);
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");
                }
                Intent eyeIntent = new Intent(ByDiseaseActivity.this,DisEyeActivity.class);
                startActivity(eyeIntent);

            }
        });
        disHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(ByDiseaseActivity.this);
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");
                }
                Intent disHeartIntent = new Intent(ByDiseaseActivity.this,DisHearActivity.class);
                startActivity(disHeartIntent);

            }
        }); disOrtho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(ByDiseaseActivity.this);
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");
                }
                Intent disOrthoIntent = new Intent(ByDiseaseActivity.this,DisOrthoActivity.class);
                startActivity(disOrthoIntent);

            }
        });
        disLiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(ByDiseaseActivity.this);
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");
                }
                Intent disLiverIntent = new Intent(ByDiseaseActivity.this,DisLiverActivity.class);
                startActivity(disLiverIntent);

            }
        });


        disSkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent disSkinIntent = new Intent(ByDiseaseActivity.this,DisSkinActivity.class);
                startActivity(disSkinIntent);

            }
        });
        disNeck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent disNeckIntent = new Intent(ByDiseaseActivity.this,DisNeckActivity.class);
                startActivity(disNeckIntent);

            }
        });
        disMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent disMedicineIntent = new Intent(ByDiseaseActivity.this,DisMedicineActivity.class);
                startActivity(disMedicineIntent);

            }
        });





    }
}