package com.example.nour1;

import android.media.MediaPlayer;

import androidx.appcompat.app.AppCompatActivity;

public class AudioPiano {

    private static AudioPiano instance;

    MediaPlayer n_c4;
    MediaPlayer n_d4;
    MediaPlayer n_db4;
    MediaPlayer n_e4;
    MediaPlayer n_eb4;
    MediaPlayer n_f4;
    MediaPlayer n_g4;
    MediaPlayer n_gb4;
    MediaPlayer n_a4;
    MediaPlayer n_ab4;
    MediaPlayer n_b4;
    MediaPlayer n_bb4;

    public AudioPiano(AppCompatActivity activity){
        //give the variables audio values
        n_c4=MediaPlayer.create(activity,R.raw.c4);
        n_d4=MediaPlayer.create(activity,R.raw.d4);
        n_db4=MediaPlayer.create(activity,R.raw.db4);
        n_e4=MediaPlayer.create(activity,R.raw.e4);
        n_eb4=MediaPlayer.create(activity,R.raw.eb4);
        n_f4=MediaPlayer.create(activity,R.raw.f4);
        n_g4=MediaPlayer.create(activity,R.raw.g4);
        n_gb4=MediaPlayer.create(activity,R.raw.gb4);
        n_a4=MediaPlayer.create(activity,R.raw.a4);
        n_ab4=MediaPlayer.create(activity,R.raw.ab4);
        n_b4=MediaPlayer.create(activity,R.raw.b4);
        n_bb4=MediaPlayer.create(activity,R.raw.bb4);
    }

    public static AudioPiano getInstance(AppCompatActivity activity)
    {
        if (instance == null)
            instance = new AudioPiano(activity);

        return instance;
    }
    // gets functions to use it in "Playpiano" class
    public MediaPlayer getC4() {
        return n_c4;
    }
    public MediaPlayer getD4() {
        return n_d4;
    }
    public MediaPlayer getDb4() {
        return n_db4;
    }
    public MediaPlayer getE4() {
        return n_e4;
    }
    public MediaPlayer getEb4() {
        return n_eb4;
    }
    public MediaPlayer getF4() {
        return n_f4;
    }
    public MediaPlayer getG4() {
        return n_g4;
    }
    public MediaPlayer getGb4() {
        return n_gb4;
    }
    public MediaPlayer getA4() {
        return n_a4;
    }
    public MediaPlayer getAb4() {
        return n_ab4;
    }
    public MediaPlayer getB4() {
        return n_b4;
    }
    public MediaPlayer getBb4() {
        return n_bb4;
    }

}
