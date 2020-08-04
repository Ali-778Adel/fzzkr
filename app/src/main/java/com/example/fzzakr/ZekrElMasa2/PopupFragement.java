package com.example.fzzakr.ZekrElMasa2;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fzzakr.AzkarElSabah.Play_Pause_Audio;
import com.example.fzzakr.R;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;


public class PopupFragement extends DialogFragment implements Runnable {
    FileInputStream fiss;
    DataInputStream diss;


    private static final String  Frag_tiltle="tiltle";
    private static final String frg_mediaPlayer="mediaplayer";
    private static final String Frag_message="message";


SeekBar seekbar;

    private String title;
    private String message ;
    TextView textView;
    Button button;
    MediaPlayer media;

    PlaymediaButtons playmediaButtons;
    public PopupFragement() {
    }


    public static   PopupFragement newinstance (String title,String message  ){
       Bundle bundle=new Bundle();
       bundle.putString(Frag_tiltle,title);
       bundle.putString(Frag_message,message);
      PopupFragement popupFargment=new  PopupFragement();
        popupFargment.setArguments(bundle);
       return popupFargment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
Bundle argument=getArguments();
if(argument!=null){
    title= argument.getString(Frag_tiltle);
    message=argument.getString(Frag_message);



}
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


          View view=    inflater.inflate(R.layout.fragment_popup_fragement, container, false);
         textView=view.findViewById(R.id.fragmenttxt);
         button=view.findViewById(R.id.fragment_play_button);
         textView.setText(message);
         seekbar=view.findViewById(R.id.fragment_seekbar);



        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        try {
            fiss=getActivity().openFileInput(ZekerElMasaa.mediafile);
            diss= new DataInputStream(fiss);
            media=MediaPlayer.create(getActivity(),diss.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!media.isPlaying()){
                     media.start();

                seekUpadation();
                }
                else  {
                    media.pause();
                }



            }
        });



    }
Handler seekHandler=new Handler();
    @Override
    public void run() {

if (media.isPlaying()) {
    seekbar.setMax(media.getDuration());
    seekUpadation();


}
        }


    public  void seekUpadation (){
        seekbar.setProgress(media.getCurrentPosition());
        seekHandler.postDelayed(this,100);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser){

                    media.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


    @Override
    public void onStop() {
        super.onStop();
    media.stop();
    }



}
