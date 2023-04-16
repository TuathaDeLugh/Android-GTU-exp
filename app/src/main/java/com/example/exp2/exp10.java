package com.example.exp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class exp10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp10);
        Button start=(Button)findViewById(R.id.button1);
        Button stop=(Button)findViewById(R.id.button2);
        start.setOnClickListener((View.OnClickListener) this);
        stop.setOnClickListener((View.OnClickListener) this);
    }
//    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button1)
        {
            startService(new Intent(this, exp10Service.class));
        }
        if(v.getId()==R.id.button2)
        {
            stopService(new Intent(this, exp10Service.class));
        }
    }
}