package com.example.fzzakr.AzkarElmasa2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fzzakr.Data_Base_SQlite.SQ_Lite_Adapter;
import com.example.fzzakr.Data_Base_SQlite.SQ_litedata_storage;
import com.example.fzzakr.R;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Play_Sound extends AppCompatActivity {


    @BindView(R.id.phon_txt)
    TextView phonTxt;
    @BindView(R.id.phone_edit_txxt)
    TextView phoneEditTxxt;
    @BindView(R.id.lout1)
    LinearLayout lout1;
    @BindView(R.id.msg_txt)
    TextView msgTxt;
    @BindView(R.id.msg_edit_txxt)
    TextView msgEditTxxt;
    @BindView(R.id.lout2)
    LinearLayout lout2;
    @BindView(R.id.net_btn)
    Button netBtn;
    @BindView(R.id.save_to_shared)
    Button saveToShared;
    @BindView(R.id.get_from_shared)
    Button getFromShared;
    @BindView(R.id.lout3)
    LinearLayout lout3;
    SharedPreferences sharedPreferences;
    @BindView(R.id.save_to_internak)
    Button saveToInternak;
    @BindView(R.id.get_from_internal)
    Button getFromInternal;
    @BindView(R.id.lout4)
    LinearLayout lout4;
    @BindView(R.id.save_to_sq)
    Button saveToSq;
    @BindView(R.id.get_from_sq)
    Button getFromSq;
    @BindView(R.id.lout5)
    LinearLayout lout5;
    private static final String fileName = "phoneMessage";
    FileInputStream fis;
    FileOutputStream fos;
    DataInputStream dis;
    DataOutputStream dos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play__sound);
        ButterKnife.bind(this);
        Intent comingIntent = getIntent();
        phoneEditTxxt.setText(comingIntent.getStringExtra(Azkar_Masa2_Main.phoneNumber));
        msgEditTxxt.setText(comingIntent.getStringExtra(Azkar_Masa2_Main.message));

        init();
    }

    public void init() {

        saveToShared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences = getPreferences(MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(Azkar_Masa2_Main.phoneNumber, phoneEditTxxt.getText().toString());
                editor.putString(Azkar_Masa2_Main.message, msgEditTxxt.getText().toString());
                editor.apply();
                phoneEditTxxt.setText("we saved your phone number");
                msgEditTxxt.setText(" we saved your message ");

            }
        });
        getFromShared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences = getPreferences(MODE_PRIVATE);
                phoneEditTxxt.setText(sharedPreferences.getString(Azkar_Masa2_Main.phoneNumber, "not available"));
                msgEditTxxt.setText(sharedPreferences.getString(Azkar_Masa2_Main.message, "no choice"));

            }
        });
        saveToInternak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    fos = openFileOutput(Play_Sound.fileName, MODE_PRIVATE);
                    dos = new DataOutputStream(fos);
                    dos.writeUTF(phoneEditTxxt.getText().toString());
                    dos.writeUTF(msgEditTxxt.getText().toString());
                    phoneEditTxxt.setText(" ");
                    msgEditTxxt.setText(" ");
                    dos.close();
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        getFromInternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    fis = openFileInput(Play_Sound.fileName);
                    dis = new DataInputStream(fis);
                    phoneEditTxxt.setText(dis.readUTF());
                    msgEditTxxt.setText(dis.readUTF());

                } catch (FileNotFoundException e) {

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        saveToSq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQ_Lite_Adapter sq_lite_adapter=new SQ_Lite_Adapter(Play_Sound.this);
               sq_lite_adapter.addentry(new SQ_litedata_storage(phoneEditTxxt.getText().toString(),msgEditTxxt.getText().toString()));
               phoneEditTxxt.setText(" ");
               msgEditTxxt.setText(" ");
            }
        });
    }
}
