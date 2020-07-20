package com.example.musicapp;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.ToggleButton;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.io.File;
import java.io.IOException;

public class BeatPage2 extends AppCompatActivity {
    MediaPlayer player;
    File path;
    SeekBar volumeadj;
    float setVolume;
    int check;
    RadioButton R1,R2,R3,R4;
    ToggleButton FinalPlay;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beat2_activity);

        R1 = findViewById(R.id.checkBox3);
        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (R1.isChecked()) {
                    check = 4;
                    path = new File(getExternalFilesDir(Environment.DIRECTORY_MUSIC) + File.separator + "Rock_Beat#1.mp3");
                    DownloadDialog();
                }
            }
        });
        R2 = findViewById(R.id.checkBox5);
        R2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (R2.isChecked()) {
                    check = 5;
                }
            }
        });
        R3 = findViewById(R.id.checkBox6);
        R3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (R3.isChecked()) {
                    check = 6;
                }
            }
        });
        R4 = findViewById(R.id.checkBox7);
        R4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (R4.isChecked()) {
                    check = 7;
                }
            }
        });
        FinalPlay = findViewById(R.id.Beat2Play);
        FinalPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (FinalPlay.isChecked()) {
                    FinalPlay.setActivated(true);
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            DownloadDialog();
                            play();
                        }
                    }).start();
                }
                if (FinalPlay.isChecked() == false) {
                    FinalPlay.setActivated(false);
                    stopPlayer();
                }
            }
        });
        next = findViewById(R.id.nextpage2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainAct5();
            }
        });
        volumeadj = findViewById(R.id.Volume2);
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
        setVolume = (float) volumeadj.getProgress() / 50;
        if (setVolume < 0.1) {setVolume = 0.1f;}
        intent.putExtra("setVolume",setVolume);
        startActivity(intent);
    }
    public void play() {
            if (player != null) {
                stopPlayer();
            }
            player = new MediaPlayer();
            setVolume = (float) volumeadj.getProgress() / 50;
            if (setVolume < 0.1) {setVolume = 0.1f;}
            try {
                player.setDataSource(String.valueOf(path));
                player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        player.start();
                    }
                });
                player.prepare();
                player.setVolume(setVolume,setVolume);
            }
            catch (IOException e)
            {
                e.printStackTrace();
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
    public void DownloadDialog()
    {
        if(path.exists() != true) {
            next.setEnabled(false);
            FinalPlay.setEnabled(false);
            final AlertDialog.Builder builder = new AlertDialog.Builder(BeatPage2.this);
            builder.setMessage("Please Download This Beat To Play It.");
            builder.setPositiveButton("Download", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    FinalPlay.setActivated(false);
                    Intent intentdownload = new Intent(getApplicationContext(), DownloadedBeats.class);
                    startActivity(intentdownload);
                }
            });
            builder.setNegativeButton("Cancel", null);
            builder.show();
        }
        if(path.exists() == true)
        {
            next.setEnabled(true);
            FinalPlay.setEnabled(true);
        }
    }
}
