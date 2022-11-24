package com.improve10x.advancedtemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_acivity);
        Handler handler = new Handler();
        handler.postDelayed(() -> {
            Intent intent = new Intent(this,TemplateActivity.class);
            startActivity(intent);
            finish();
        },3000);
    }
}