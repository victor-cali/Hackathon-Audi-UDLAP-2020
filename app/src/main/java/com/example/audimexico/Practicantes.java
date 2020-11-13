package com.example.audimexico;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Practicantes extends AppCompatActivity {
    Button btn_button57, btn_button58, btn_button59, btn_button60, btn_button61;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicantes);
        btn_button57 = findViewById(R.id.button57);
        btn_button58 = findViewById(R.id.button58);
        btn_button59 = findViewById(R.id.button59);
        btn_button60 = findViewById(R.id.button60);
        btn_button61 = findViewById(R.id.button61);
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