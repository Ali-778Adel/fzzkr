package com.example.fzzakr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fzzakr.AzkarElSabah.Play_Pause_Audio;
import com.example.fzzakr.AzkarElmasa2.Azkar_Masa2_Main;
import com.example.fzzakr.Frag.FragActivity;
import com.example.fzzakr.ZekrElMasa2.ZekerElMasaa;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.zekr_sabah)
    Button zekrSabah;
    @BindView(R.id.zekr_masaa)
    Button zekrMasaa;
    @BindView(R.id.about_app)
    Button aboutApp;
    @BindView(R.id.close_app)
    Button closeApp;
    Button button;
    @BindView(R.id.seb7a)
    Button seb7a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        zekrSabah.setOnClickListener(this);
        zekrMasaa.setOnClickListener(this);
        seb7a.setOnClickListener(this);
        closeApp.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zekr_sabah: {
                Intent goto_azkar_elsabah_main = new Intent(MainActivity.this, Play_Pause_Audio.class);
                startActivity(goto_azkar_elsabah_main);

            }
            break;
            case R.id.zekr_masaa: {
                Intent goto_azkar_elmasa2_main = new Intent(MainActivity.this, ZekerElMasaa.class);
                startActivity(goto_azkar_elmasa2_main);
            }
            break;
            case R.id.seb7a: {
                Intent goto_fRAG = new Intent(MainActivity.this, FragActivity.class);
                startActivity(goto_fRAG);
            }
            break;
            case R.id.close_app: {
                Intent in = new Intent(MainActivity.this, Azkar_Masa2_Main.class);
                startActivity(in);
            }
        }
    }

  /*  @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.zekr_sabah:{
                Intent goto_azkar_elsabah_main = new Intent(MainActivity.this, Azkar_El_Sabah_Main.class);
                startActivity(goto_azkar_elsabah_main);

            }

        }
    }*/
}