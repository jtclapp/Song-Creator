package com.example.musicapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class BeatPage2 extends AppCompatActivity {
    MediaPlayer player;
    String path;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    ToggleButton T1, T2, T3, T4;
    int check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beat2_activity);

        T1 = findViewById(R.id.play_rock1);
        T1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T2.setActivated(false);
                T3.setActivated(false);
                T4.setActivated(false);
                if (T1.isChecked()) {

                    T1.setActivated(true);

                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            path = "https://firebasestorage.googleapis.com/v0/b/beats-651c7.appspot.com/o/Rock%20Beat%201.mp3?alt=media&token=473246ca-d10e-4f88-b15c-4738070f6966";
                            play();
                        }
                    }).start();
                }
                if (T1.isChecked() == false) {
                    T1.setActivated(false);
                    pause();
                }
            }
        });
        T2 = findViewById(R.id.play_rock2);
        T2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T1.setActivated(false);
                T3.setActivated(false);
                T4.setActivated(false);
                if (T2.isChecked()) {
                    T2.setActivated(true);

                    new Thread(new Runnable() {
                        @Override
                        public void run() {

                        }
                    }).start();
                }
                if (T2.isChecked() == false) {
                    T2.setActivated(false);
                    pause();
                }
            }
        });
        T3 = findViewById(R.id.play_rock3);
        T3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T1.setActivated(false);
                T2.setActivated(false);
                T4.setActivated(false);
                if (T3.isChecked()) {
                    T3.setActivated(true);

                    new Thread(new Runnable() {
                        @Override
                        public void run() {

                        }
                    }).start();
                }
                if (T3.isChecked() == false) {
                    T3.setActivated(false);
                    pause();
                }
            }
        });
        T4 = findViewById(R.id.play_rock4);
        T4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T1.setActivated(false);
                T2.setActivated(false);
                T3.setActivated(false);
                if (T4.isChecked()) {
                    T4.setActivated(true);

                    new Thread(new Runnable() {
                        @Override
                        public void run() {

                        }
                    }).start();
                }
                if (T4.isChecked() == false) {
                    T4.setActivated(false);
                    pause();
                }
            }
        });
        checkBox1 = findViewById(R.id.checkBox3);
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked()) {
                    check = 4;
                    openMainAct5();
                }
            }
        });
        checkBox2 = findViewById(R.id.checkBox5);
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox2.isChecked()) {
                    check = 5;
                    openMainAct5();
                }
            }
        });
        checkBox3 = findViewById(R.id.checkBox6);
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox3.isChecked()) {
                    check = 6;
                    openMainAct5();
                }
            }
        });
        checkBox4 = findViewById(R.id.checkBox7);
        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox4.isChecked()) {
                    check = 7;
                    openMainAct5();
                }
            }
        });
    }
    public void openMainAct5() {
        Intent intent = new Intent(this, MainActivity5.class);
        if (check == 4) {
            intent.putExtra("check", 4);
        }
        if (check == 5) {
            intent.putExtra("check", 5);
        }
        if (check == 6) {
            intent.putExtra("check", 6);
        }
        if (check == 7) {
            intent.putExtra("check", 7);
        }
        startActivity(intent);
    }

    public void play() {

        if (player != null) {
            stopPlayer();
        }
        player = new MediaPlayer();
        try {
            player.setDataSource(path);
            player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    player.start();
                }
            });
            player.prepare();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void pause() {
        if (player != null) {
            player.pause();
        }
    }

    private void stopPlayer() {
        if (player != null) {
            player.release();
            player = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}
