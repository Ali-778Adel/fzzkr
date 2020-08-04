package com.example.fzzakr.ZekrElMasa2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fzzakr.R;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ZekerElMasaa extends AppCompatActivity implements View.OnClickListener {


    FileOutputStream foss;
    DataInputStream diss;
    DataOutputStream doss;
    public static final String mediafile = "mediafile";


    TextView text;
    public static final String media_key = "mediakey";
    @BindView(R.id.txt1)
    TextView txt1;
    @BindView(R.id.play_button1)
    Button playButton1;
    @BindView(R.id.count_button1)
    Button countButton1;
    @BindView(R.id.txt2)
    TextView txt2;
    @BindView(R.id.play_button2)
    Button playButton2;
    @BindView(R.id.count_button2)
    Button countButton2;
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
    @BindView(R.id.count_button24)
    Button countButton24;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeker_el_masaa);
        ButterKnife.bind(this);

        callonclicks();
    }

    private void callonclicks() {
        playButton1.setOnClickListener(this);
        playButton2.setOnClickListener(this);
        playButton3.setOnClickListener(this);
        playButton4.setOnClickListener(this);
        playButton5.setOnClickListener(this);
        playButton6.setOnClickListener(this);
        playButton7.setOnClickListener(this);
        playButton8.setOnClickListener(this);
        playButton9.setOnClickListener(this);
        playButton10.setOnClickListener(this);
        playButton11.setOnClickListener(this);
        playButton12.setOnClickListener(this);
        playButton13.setOnClickListener(this);
        playButton14.setOnClickListener(this);
        playButton15.setOnClickListener(this);
        playButton16.setOnClickListener(this);
        playButton17.setOnClickListener(this);
        playButton18.setOnClickListener(this);
        countButton1.setOnClickListener(this);
        countButton2.setOnClickListener(this);
        countButton3.setOnClickListener(this);
        countButton4.setOnClickListener(this);
        countButton5.setOnClickListener(this);
        countButton6.setOnClickListener(this);
        countButton7.setOnClickListener(this);
        countButton8.setOnClickListener(this);
        countButton9.setOnClickListener(this);
        countButton10.setOnClickListener(this);
        countButton11.setOnClickListener(this);
        countButton12.setOnClickListener(this);
        countButton13.setOnClickListener(this);
        countButton14.setOnClickListener(this);
        countButton15.setOnClickListener(this);
        countButton16.setOnClickListener(this);
        countButton17.setOnClickListener(this);
        countButton18.setOnClickListener(this);
        countButton19.setOnClickListener(this);
        countButton20.setOnClickListener(this);
        countButton21.setOnClickListener(this);
        countButton22.setOnClickListener(this);
        countButton23.setOnClickListener(this);
        countButton24.setOnClickListener(this);
        countButton25.setOnClickListener(this);
        countButton26.setOnClickListener(this);
        countButton27.setOnClickListener(this);
        countButton28.setOnClickListener(this);
        countButton29.setOnClickListener(this);
        countButton30.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.play_button1: {

                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt1.getText().toString());
                popupFragement.show(getSupportFragmentManager(), null);
                String filePath = getApplicationContext().getFilesDir().getPath();
                File file = new File(filePath);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr1);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            break;
            case R.id.play_button2: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt2.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr2);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button3: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt3.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr3);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            break;
            case R.id.play_button4: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt4.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button5: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt5.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button6: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt6.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button7: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt7.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button8: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt8.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button9: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt9.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button10: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt10.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button11: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt11.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button12: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt12.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button13: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt13.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button14: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt14.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button15: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt15.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button16: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt16.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button17: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt17.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.play_button18: {
                PopupFragement popupFragement = PopupFragement.newinstance("Zekr", txt18.getText().toString()
                );
                popupFragement.show(getSupportFragmentManager(), null);
                try {
                    foss = openFileOutput(mediafile, MODE_PRIVATE);
                    doss = new DataOutputStream(foss);
                    doss.writeInt(R.raw.zekr4);
                    foss.close();
                    doss.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.count_button1:
            {
                countButton1.setText("تم");
            }break;
            case R.id.count_button2:
            {
                countButton2.setText("تم");
            }break;
            case R.id.count_button6:
            {
                countButton6.setText("تم");
            }break;
            case R.id.count_button7:
            {
                countButton7.setText("تم");
            }break;
            case R.id.count_button10:
            {
                countButton10.setText("تم");
            }break;
            case R.id.count_button13:
            {
                countButton13.setText("تم");
            }break;
            case R.id.count_button14:
            {
                countButton14.setText("تم");
            }break;
            case R.id.count_button18:
            {
                countButton18.setText("تم");
            }break;
            case R.id.count_button20:
            {
                countButton20.setText("تم");
            }break;
            case R.id.count_button21:
            {
                countButton21.setText("تم");
            }break;
            case R.id.count_button29:
            {
                countButton29.setText("تم");
            }


            break;
            case R.id.count_button3:
            { int counter = Integer.parseInt(countButton3.getText().toString());
                if (counter > 0) {
                    countButton3.setText("" + (--counter));
                }
                try {
                    if (counter == 0) {
                        countButton3.setText("تم");
                        countButton3.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button4:
            { int counter = Integer.parseInt(countButton4.getText().toString());
                if (counter > 0) {
                    countButton4.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton4.setText("تم");
                        countButton4.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button5:
            { int counter = Integer.parseInt(countButton5.getText().toString());
                if (counter > 0) {
                    countButton5.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton5.setText("تم");
                        countButton5.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button8:
            { int counter = Integer.parseInt(countButton8.getText().toString());
                if (counter > 0) {
                    countButton8.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton8.setText("تم");
                        countButton8.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button12:
            { int counter = Integer.parseInt(countButton12.getText().toString());
                if (counter > 0) {
                    countButton12.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton12.setText("تم");
                        countButton12.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button15:
            { int counter = Integer.parseInt(countButton15.getText().toString());
                if (counter > 0) {
                    countButton15.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton15.setText("تم");
                        countButton15.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button16:
            { int counter = Integer.parseInt(countButton16.getText().toString());
                if (counter > 0) {
                    countButton16.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton16.setText("تم");
                        countButton16.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button17:
            { int counter = Integer.parseInt(countButton17.getText().toString());
                if (counter > 0) {
                    countButton17.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton17.setText("تم");
                        countButton17.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button19:
            { int counter = Integer.parseInt(countButton19.getText().toString());
                if (counter > 0) {
                    countButton19.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton19.setText("تم");
                        countButton19.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button22:
            { int counter = Integer.parseInt(countButton22.getText().toString());
                if (counter > 0) {
                    countButton22.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton22.setText("تم");
                        countButton22.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button24:
                { int counter = Integer.parseInt(countButton24.getText().toString());
                if (counter > 0) {
                    countButton24.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton24.setText("تم");
                        countButton24.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button25:
            { int counter = Integer.parseInt(countButton25.getText().toString());
                if (counter > 0) {
                    countButton25.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton25.setText("تم");
                        countButton25.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button26:
            { int counter = Integer.parseInt(countButton26.getText().toString());
                if (counter > 0) {
                    countButton26.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton26.setText("تم");
                        countButton26.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button27:
            { int counter = Integer.parseInt(countButton27.getText().toString());
                if (counter > 0) {
                    countButton27.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton27.setText("تم");
                        countButton27.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;

            case R.id.count_button9:
            { int counter = Integer.parseInt(countButton9.getText().toString());
                if (counter > 0) {
                    countButton9.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton9.setText("تم");
                        countButton9.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
                break;

            case R.id.count_button11:
            { int counter = Integer.parseInt(countButton11.getText().toString());
                if (counter > 0) {
                    countButton11.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton11.setText("تم");
                        countButton11.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;

            case R.id.count_button23:
            { int counterr = Integer.parseInt(countButton23.getText().toString());
                if (counterr > 0) {
                    countButton23.setText("" + (--counterr)); }
                try {
                    if (counterr == 0) {
                        countButton23.setText("تم");
                        countButton23.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;

            case R.id.count_button30:
            { int counter = Integer.parseInt(countButton30.getText().toString());
                if (counter > 0) {
                    countButton30.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton30.setText("تم");
                        countButton30.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button28:
            {
                int count=Integer.parseInt(countButton28.getText().toString());
                if(count >0){
                    countButton28.setText(""+ --count);

                }
                if(count==0){
                    countButton28.setText("تم");
                }

            }break;


        }
    }


}
