package com.example.exp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class exp4 extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btnStatus;
    TextView tvLoginStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp4);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnStatus = (Button) findViewById(R.id.button);
        tvLoginStatus = (TextView) findViewById(R.id.tvLoginStatus);
        etPassword.addTextChangedListener(TextChange);
        etUsername.addTextChangedListener(TextChange);
        check();
        btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), exp4land.class);
                startActivity(i);
            }
        });
    }

    private TextWatcher TextChange=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            check();
        }
    };
    public void check(){
        if(etUsername.getText().toString().equals("Umang") && etPassword.getText().toString().equals("123")){
            btnStatus.setEnabled(true);
        }else{
            btnStatus.setEnabled(false);
        }
    }
}