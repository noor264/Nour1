package com.example.nour1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Playpiano extends AppCompatActivity {

    MediaPlayer player;
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

    public void playa(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.a4);
        }
        player.start();
    }
    public void playab(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.ab4);
        }
        player.start();
    }
    public void playb(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.b4);
        }
        player.start();
    }
    public void playbb(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.bb4);
        }
        player.start();
    }
    public void playc(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.c4);
        }
        player.start();
    }
    public void playd(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.d4);
        }
        player.start();
    }
    public void playdb(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.db4);
        }
        player.start();
    }
    public void playe(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.e4);
        }
        player.start();
    }
    public void playeb(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.eb4);
        }
        player.start();
    }
    public void playf(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.f4);
        }
        player.start();
    }
    public void playg(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.g4);
        }
        player.start();
    }
    public void playgb(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.gb4);
        }
        player.start();
    }

}