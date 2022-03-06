package com.example.nour1;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Playpiano extends AppCompatActivity {

    AudioPiano all;
    Button c;
    Button d;
    Button db;
    Button e;
    Button eb;
    Button f;
    Button g;
    Button gb;
    Button a;
    Button ab;
    Button b;
    Button bb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playpiano);
        connectComponents();
    }

    private void connectComponents() {
        all = AudioPiano.getInstance(this);

    }


}