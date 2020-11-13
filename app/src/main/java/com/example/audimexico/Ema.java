package com.example.audimexico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ema extends AppCompatActivity {
    Button btn_button48,btn_button49,btn_button50, btn_button51,btn_button52;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ema);

        btn_button48=(Button)findViewById(R.id.button48);
        btn_button49=(Button)findViewById(R.id.button49);
        btn_button50=(Button)findViewById(R.id.button50);
        btn_button51=(Button)findViewById(R.id.button51);
        btn_button52=(Button)findViewById(R.id.button52);

        btn_button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}