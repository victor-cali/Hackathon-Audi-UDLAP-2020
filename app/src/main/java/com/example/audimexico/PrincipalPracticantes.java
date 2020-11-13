package com.example.audimexico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalPracticantes extends AppCompatActivity {
    Button btn_button32,btn_button33,btn_button34, btn_button35,btn_button36;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_practicantes);

        btn_button32=(Button)findViewById(R.id.button32);
        btn_button33=(Button)findViewById(R.id.button33);
        btn_button34=(Button)findViewById(R.id.button34);
        btn_button35=(Button)findViewById(R.id.button35);
        btn_button36=(Button)findViewById(R.id.button36);

        btn_button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btn_button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}