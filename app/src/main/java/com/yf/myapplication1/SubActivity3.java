package com.yf.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);

        TextView textView=findViewById(R.id.textView1);


        Intent i=this.getIntent();
        String txtName=i.getStringExtra("txtName");
        textView.setText(txtName);

        Toast.makeText(this,txtName,Toast.LENGTH_LONG).show();

    }
}
