package com.juanes.dochome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;

import java.util.Timer;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Dochome);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    }
}