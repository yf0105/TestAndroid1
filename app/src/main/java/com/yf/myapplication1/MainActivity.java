package com.yf.myapplication1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox=findViewById(R.id.m_checkBox);
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) ->
                Toast.makeText(MainActivity.this,isChecked ? "on":"off",Toast.LENGTH_LONG).show());
    }

    public void btn_onClick(View view){
        System.out.println("btn_onClick");
        EditText editText=findViewById(R.id.editTextTextPersonName2);
        editText.setText(R.string.msg3);
    }

    public void toSub1(View view) {
        Intent sub1=new Intent(this,SubActivity.class);
        startActivity(sub1);
    }
    public void toSub2(View view) {
        Intent sub2=new Intent(this,SubActivity2.class);
        startActivity(sub2);
    }
    public void toSub3(View view) {
        Intent sub3=new Intent(this,SubActivity3.class);
        EditText editText;
        editText = findViewById(R.id.editTextTextPersonName2);

        sub3.putExtra("txtName",editText.getText().toString());
        startActivity(sub3);
    }



    public void toast_onClick(View view) {
        Toast toast=Toast.makeText(this,R.string.msg1,Toast.LENGTH_LONG);
        toast.show();
    }

    public void log_onClick(View view) {
        Log.d("yf","test log");
    }
}