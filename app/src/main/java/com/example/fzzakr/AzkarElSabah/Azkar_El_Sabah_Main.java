package com.example.fzzakr.AzkarElSabah;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fzzakr.R;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Azkar_El_Sabah_Main extends AppCompatActivity {


    FileOutputStream foss;
    DataInputStream diss;
    DataOutputStream doss;
    public static final String mediafile = "mediafile";
    @BindView(R.id.txt1)
    TextView txt1;
    @BindView(R.id.play_button1)
    Button playButton1;
    @BindView(R.id.count_button1)
    Button countButton1;
    @BindView(R.id.txt3)
    TextView txt3;
    @BindView(R.id.play_button3)
    Button playButton3;
    @BindView(R.id.count_button3)
    Button countButton3;
    @BindView(R.id.txt4)
    TextView txt4;
    @BindView(R.id.play_button4)
    Button playButton4;
    @BindView(R.id.count_button4)
    Button countButton4;
    @BindView(R.id.txt5)
    TextView txt5;
    @BindView(R.id.play_button5)
    Button playButton5;
    @BindView(R.id.count_button5)
    Button countButton5;
    @BindView(R.id.txt6)
    TextView txt6;
    @BindView(R.id.play_button6)
    Button playButton6;
    @BindView(R.id.count_button6)
    Button countButton6;
    @BindView(R.id.txt7)
    TextView txt7;
    @BindView(R.id.play_button7)
    Button playButton7;
    @BindView(R.id.count_button7)
    Button countButton7;
    @BindView(R.id.txt8)
    TextView txt8;
    @BindView(R.id.play_button8)
    Button playButton8;
    @BindView(R.id.count_button8)
    Button countButton8;
    @BindView(R.id.txt9)
    TextView txt9;
    @BindView(R.id.play_button9)
    Button playButton9;
    @BindView(R.id.count_button9)
    Button countButton9;
    @BindView(R.id.txt10)
    TextView txt10;
    @BindView(R.id.play_button10)
    Button playButton10;
    @BindView(R.id.count_button10)
    Button countButton10;
    @BindView(R.id.txt11)
    TextView txt11;
    @BindView(R.id.play_button11)
    Button playButton11;
    @BindView(R.id.count_button11)
    Button countButton11;
    @BindView(R.id.txt12)
    TextView txt12;
    @BindView(R.id.play_button12)
    Button playButton12;
    @BindView(R.id.count_button12)
    Button countButton12;
    @BindView(R.id.txt13)
    TextView txt13;
    @BindView(R.id.play_button13)
    Button playButton13;
    @BindView(R.id.count_button13)
    Button countButton13;
    @BindView(R.id.txt14)
    TextView txt14;
    @BindView(R.id.play_button14)
    Button playButton14;
    @BindView(R.id.count_button14)
    Button countButton14;
    @BindView(R.id.txt15)
    TextView txt15;
    @BindView(R.id.play_button15)
    Button playButton15;
    @BindView(R.id.count_button15)
    Button countButton15;
    @BindView(R.id.txt16)
    TextView txt16;
    @BindView(R.id.play_button16)
    Button playButton16;
    @BindView(R.id.count_button16)
    Button countButton16;
    @BindView(R.id.txt17)
    TextView txt17;
    @BindView(R.id.play_button17)
    Button playButton17;
    @BindView(R.id.count_button17)
    Button countButton17;
    @BindView(R.id.txt18)
    TextView txt18;
    @BindView(R.id.play_button18)
    Button playButton18;
    @BindView(R.id.count_button18)
    Button countButton18;
    @BindView(R.id.txt19)
    TextView txt19;
    @BindView(R.id.play_button19)
    Button playButton19;
    @BindView(R.id.count_button19)
    Button countButton19;
    @BindView(R.id.txt20)
    TextView txt20;
    @BindView(R.id.play_button20)
    Button playButton20;
    @BindView(R.id.count_button20)
    Button countButton20;
    @BindView(R.id.txt21)
    TextView txt21;
    @BindView(R.id.play_button21)
    Button playButton21;
    @BindView(R.id.count_button21)
    Button countButton21;
    @BindView(R.id.txt22)
    TextView txt22;
    @BindView(R.id.play_button22)
    Button playButton22;
    @BindView(R.id.count_button22)
    Button countButton22;
    @BindView(R.id.txt23)
    TextView txt23;
    @BindView(R.id.play_button23)
    Button playButton23;
    @BindView(R.id.count_button23)
    Button countButton23;
    @BindView(R.id.txt24)
    TextView txt24;
    @BindView(R.id.play_button24)
    Button playButton24;
    @BindView(R.id.count_button224)
    Button countButton224;
    @BindView(R.id.txt25)
    TextView txt25;
    @BindView(R.id.play_button25)
    Button playButton25;
    @BindView(R.id.count_button25)
    Button countButton25;
    @BindView(R.id.txt26)
    TextView txt26;
    @BindView(R.id.play_button26)
    Button playButton26;
    @BindView(R.id.count_button26)
    Button countButton26;
    @BindView(R.id.txt27)
    TextView txt27;
    @BindView(R.id.play_button27)
    Button playButton27;
    @BindView(R.id.count_button27)
    Button countButton27;
    @BindView(R.id.txt28)
    TextView txt28;
    @BindView(R.id.play_button28)
    Button playButton28;
    @BindView(R.id.count_button28)
    Button countButton28;
    @BindView(R.id.txt29)
    TextView txt29;
    @BindView(R.id.play_button29)
    Button playButton29;
    @BindView(R.id.count_button29)
    Button countButton29;
    @BindView(R.id.txt30)
    TextView txt30;
    @BindView(R.id.play_button30)
    Button playButton30;
    @BindView(R.id.count_button30)
    Button countButton30;
    @BindView(R.id.txt31)
    TextView txt31;
    @BindView(R.id.play_button31)
    Button playButton31;
    @BindView(R.id.count_button31)
    Button countButton31;
    @BindView(R.id.txt32)
    TextView txt32;
    @BindView(R.id.play_button32)
    Button playButton32;
    @BindView(R.id.count_button32)
    Button countButton32;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar__el__sabah__main);
        ButterKnife.bind(this);


    }


}
