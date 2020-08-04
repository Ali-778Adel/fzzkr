package com.example.fzzakr.Frag;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fzzakr.R;

import java.util.Objects;

import butterknife.BindView;

import static android.content.Context.MODE_PRIVATE;


public class Fragment1 extends Fragment {
TextView textView;
int incomdata;
String key1="incom";
SharedPreferences sharedPreferences;
Fragment2 fragment2;
    public Fragment1() {
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

     View view=inflater.inflate(R.layout.fragment_1, container, false);
     textView=(TextView)view.findViewById(R.id.txt_counter);

   return  view ;

    }
public void textupdation(int counter){
        incomdata=counter;
       textView.setText("  "+incomdata);
  }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
            sharedPreferences = getActivity().getPreferences(MODE_PRIVATE);
            textView.setText("  " + sharedPreferences.getInt(key1,0));
        }

    @Override
    public void onPause() {
        super.onPause();
    super.onDestroyView();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        sharedPreferences=getActivity().getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putInt(key1, incomdata);
    editor.apply();
    }
}





