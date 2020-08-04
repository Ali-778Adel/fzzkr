package com.example.fzzakr.Frag;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fzzakr.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragActivity extends AppCompatActivity implements Commuincature {
    Fragment1 fragment1;
    Fragment2 fragment2;
    SharedPreferences sharedPreferences;
    @BindView(R.id.action_bar_spinner)
    Spinner actionBarSpinner;
public static final String postionNumber="positionnumber";
public static final String countervalue="countervalue";

int position ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);
        ButterKnife.bind(this);
        fragment1 = (Fragment1) getSupportFragmentManager().findFragmentById(R.id.fragment);
        fragment2 = (Fragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);

        spinnerupdation();
       getfragdata();
        }


public void spinnerupdation(){
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String >(this,android.R.layout.simple_spinner_dropdown_item,
            getResources().getStringArray(R.array.multiplezekr));
        actionBarSpinner.setAdapter(arrayAdapter);

        actionBarSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             position=actionBarSpinner.getSelectedItemPosition();
             sharedPreferences=getPreferences(MODE_PRIVATE);
                 SharedPreferences.Editor editor=sharedPreferences.edit();
                 editor.putInt(postionNumber, position);

                 editor.apply();


            fragment1.textView.setText("");
            fragment2.count_btn=0;


       ;
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });
}

    @Override
    public void count(int counter) {
        fragment1.textupdation(counter);
        sharedPreferences=getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putInt(countervalue,counter);


    }



    public void getfragdata(){

sharedPreferences=getPreferences(MODE_PRIVATE);
 int spinnervalue=sharedPreferences.getInt(postionNumber,0);
 if(spinnervalue!=0){

     actionBarSpinner.setSelection(spinnervalue);
  sharedPreferences.getInt(countervalue,0);
 fragment1.textView.setText(""+sharedPreferences.getInt(countervalue,0));
 }
    }
    @Override
    public void onPause() {
        super.onPause();



    }

}


