package com.example.audimexico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Practicantes extends AppCompatActivity {
    Button btn_button57,btn_button58,btn_button59,btn_button60,btn_button61;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicantes);
        btn_button57=(Button)findViewById(R.id.button57);
        btn_button58=(Button)findViewById(R.id.button58);
        btn_button59=(Button)findViewById(R.id.button59);
        btn_button60=(Button)findViewById(R.id.button60);
        btn_button61=(Button)findViewById(R.id.button61);
        btn_button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btn_button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btn_button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btn_button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}