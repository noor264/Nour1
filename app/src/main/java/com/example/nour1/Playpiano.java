package com.example.nour1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Playpiano extends AppCompatActivity {

    AudioPiano all;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playpiano);
        all = AudioPiano.getInstance(this);
    }


}