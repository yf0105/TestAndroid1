package com.yf.myapplication1;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        SeekBar seekBar=findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                this.progress=progress;
                //この位置でトーストとすると表示が追い付かない
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SubActivity.this,String.format("現在値:%d",progress),Toast.LENGTH_SHORT).show();

            }
        });

        Spinner spinner=findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SubActivity.this,String.format("選択項目:%s",parent.getSelectedItem()),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void btn_onClick(View view){
        List<String> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add("item-"+Integer.toString(i));
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,list);
        Spinner spinner=findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
    }
}
