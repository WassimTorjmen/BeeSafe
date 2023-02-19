package com.example.beesave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // your code to start second activity. Will wait for 3 seconds before calling this method

                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        }, 3000);

    }
}