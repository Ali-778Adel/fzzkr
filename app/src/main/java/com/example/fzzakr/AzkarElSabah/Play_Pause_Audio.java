package com.example.fzzakr.AzkarElSabah;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.CursorJoiner;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import com.example.fzzakr.R;
import com.example.fzzakr.ZekrElMasa2.PlaymediaButtons;
import com.example.fzzakr.ZekrElMasa2.PopupFragement;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.transform.Result;

public class Play_Pause_Audio extends Azkar_El_Sabah_Main implements View.OnClickListener
{






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        callonclicks();
    }

    private void callonclicks() {
        playButton1.setOnClickListener(this);

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
        countButton3.setOnClickListener(this);
        countButton1.setOnClickListener(this);
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
        countButton224.setOnClickListener(this);
        countButton25.setOnClickListener(this);
        countButton26.setOnClickListener(this);
        countButton27.setOnClickListener(this);
        countButton28.setOnClickListener(this);
        countButton29.setOnClickListener(this);
        countButton30.setOnClickListener(this);
        countButton31.setOnClickListener(this);
        countButton32.setOnClickListener(this);
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
            }break;
            case R.id.count_button28:
            {
                countButton28.setText("تم");
            }break;
            case R.id.count_button27:
            {
                countButton27.setText("تم");
            }break;




            case R.id.count_button3:
            { int counter = Integer.parseInt(countButton3.getText().toString());
                if (counter > 0) {
                    countButton3.setText("" + (--counter)); }
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
            case R.id.count_button224:
            { int counter = Integer.parseInt(countButton224.getText().toString());
                if (counter > 0) {
                    countButton3.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton224.setText("تم");
                        countButton224.setEnabled(false);
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
            case R.id.count_button31:
            { int counter = Integer.parseInt(countButton31.getText().toString());
                if (counter > 0) {
                    countButton31.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton31.setText("تم");
                        countButton31.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
            case R.id.count_button32:
            { int counter = Integer.parseInt(countButton32.getText().toString());
                if (counter > 0) {
                    countButton32.setText("" + (--counter)); }
                try {
                    if (counter == 0) {
                        countButton32.setText("تم");
                        countButton32.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } }
            break;
        }
    }




}

