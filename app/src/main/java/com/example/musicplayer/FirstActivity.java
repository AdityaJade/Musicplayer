package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.database.FirebaseDatabase;

import java.util.Timer;
import java.util.TimerTask;

public class FirstActivity extends AppCompatActivity {
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_first );
        timer=new Timer (  );
        timer.schedule ( new TimerTask () {
            @Override
            public void run() {
                Intent internt= new Intent ( FirstActivity.this, MainActivity.class );
                startActivity ( internt );
                finish();
            }
        }, 3000 );
    }
}