package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private ImageButton lib_button;
    private ImageButton reclib_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBeatpage1();
            }
        });
        button2 = findViewById(R.id.button5);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBeatpage2();
            }
        });
        button3 = findViewById(R.id.R_B_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBeatpage3();
            }
        });
        button4 = findViewById(R.id.country_button);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBeatpage4();
            }
        });
        lib_button = findViewById(R.id.library);
        lib_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLibrary();
            }
        });
        reclib_button = findViewById(R.id.recordlibrary);
        reclib_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecordingLibrary();
            }
        });
    }

    public void openBeatpage1() {
        Intent intent = new Intent(this, BeatPage1.class);
        startActivity(intent);
    }

    public void openBeatpage2() {
        Intent intent = new Intent(this, BeatPage2.class);
        startActivity(intent);
    }

    public void openBeatpage3() {
        Intent intent = new Intent(this, Beatpage3.class);
        startActivity(intent);
    }

    public void openBeatpage4() {
        Intent intent = new Intent(this, Beatpage4.class);
        startActivity(intent);
    }

    public void openLibrary() {
        Intent intent = new Intent(this, LyricsLibrary.class);
        startActivity(intent);
    }

    public void openRecordingLibrary() {
        Intent intent = new Intent(this, RecordingLibrary.class);
        startActivity(intent);
    }
}