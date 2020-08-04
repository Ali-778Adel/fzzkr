package com.example.fzzakr.Frag;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fzzakr.R;

import java.util.Set;

import javax.xml.transform.sax.SAXResult;

import butterknife.BindView;

import static android.content.Context.MODE_PRIVATE;


public class Fragment2 extends Fragment {
int count_btn =0;
Button countButton;
Commuincature commuincature;
SharedPreferences sharedPreferences;

String key="counnt" ;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {

       View view= inflater.inflate(R.layout.fragment_2, container, false);
 countButton=(Button)view.findViewById(R.id.cont_btn);
 countButton.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
    commuincature.count(++count_btn);

    }
 });
       return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    commuincature=(FragActivity)getActivity();
    sharedPreferences=getActivity().getPreferences(MODE_PRIVATE);
count_btn=sharedPreferences.getInt(Fragment2.this.key,0);

    }

    @Override
    public void onPause() {
        super.onPause();
        sharedPreferences = getActivity().getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(Fragment2.this.key, count_btn);
        editor.apply();
    }

    @Override
    public void onDestroy() {

        super.onDestroy();
        sharedPreferences = getActivity().getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(Fragment2.this.key, count_btn);
        editor.apply();
    }
}
