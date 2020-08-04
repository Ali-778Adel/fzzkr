package com.example.fzzakr.AzkarElmasa2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fzzakr.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Azkar_Masa2_Main extends AppCompatActivity {


    @BindView(R.id.phon_txt)
    TextView phonTxt;
    @BindView(R.id.phone_edit_txxt)
    EditText phoneEditTxxt;
    @BindView(R.id.lout1)
    LinearLayout lout1;
    @BindView(R.id.msg_txt)
    TextView msgTxt;
    @BindView(R.id.msg_edit_txxt)
    EditText msgEditTxxt;
    @BindView(R.id.lout2)
    LinearLayout lout2;
    @BindView(R.id.net_btn)
    Button netBtn;
   public String userInput;
    public static  final String phoneNumber="phoneNumber";
    public static final String message="message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar__masa2__main);
        ButterKnife.bind(this);
      netBtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent outintent =new Intent(getApplicationContext(),Play_Sound.class);
          userInput=phoneEditTxxt.getText().toString();
          outintent.putExtra(phoneNumber,userInput);
          userInput=msgEditTxxt.getText().toString();
          outintent.putExtra(message,userInput);
          startActivity(outintent);
          }
      });


    }


}

