package com.music.songcreator.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.music.songcreator.R;
import com.music.songcreator.SQLite.DataBaseHelper;
import com.music.songcreator.SQLite.RecordingModel;

public class RecSelector extends AppCompatActivity {
    ListView lv_recordinglist;
    ArrayAdapter recordingArrayAdapter;
    DataBaseHelper dataBaseHelper;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec_selector);

        mAdView = findViewById(R.id.adView11);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        lv_recordinglist = findViewById(R.id.recording_list2);
        dataBaseHelper = new DataBaseHelper(RecSelector.this);
        ShowRecording();

        lv_recordinglist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(final AdapterView<?> adapterView, View view, final int i, long l) {
                AlertDialog.Builder builder = new AlertDialog.Builder(RecSelector.this);
                builder.setMessage("Are you sure you want to select this?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        RecordingModel clickedRecording = (RecordingModel) adapterView.getItemAtPosition(i);
                        String name = clickedRecording.getName();

                        Intent intent = new Intent();
                        intent.putExtra("name", name);
                        setResult(RESULT_OK, intent);
                        finish();
                    }
                });
                builder.setNegativeButton("No", null);
                builder.show();
            }
        });
    }

    private void ShowRecording() {
        recordingArrayAdapter = new ArrayAdapter<RecordingModel>(RecSelector.this, android.R.layout.simple_list_item_1, dataBaseHelper.getEveryone2());
        lv_recordinglist.setAdapter(recordingArrayAdapter);
    }
}