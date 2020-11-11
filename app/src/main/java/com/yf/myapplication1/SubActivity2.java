package com.yf.myapplication1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SubActivity2 extends AppCompatActivity {
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);


    }
    public void btn_onClick(View view){
        List<String> list=new ArrayList<>();
        for (int i=0;i<10;i++) {
            list.add("test-"+i);
        }
//        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice,list);
        ListView lv=findViewById(R.id.listview);
        lv.setAdapter(adapter);

//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                TextView textView= (TextView) view;
//                adapter.remove((String) textView.getText());
//            }
//        });
        //長押しイベント
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView= (TextView) view;
                adapter.remove((String) textView.getText());
                return false;
            }

        });
    }
}
