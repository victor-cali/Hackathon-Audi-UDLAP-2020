package com.example.audimexico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dual extends AppCompatActivity {
    Button btn_button53,btn_button54,btn_button55,btn_button56;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dual);
        btn_button53=(Button)findViewById(R.id.button9);
        btn_button54=(Button)findViewById(R.id.button10);
        btn_button55=(Button)findViewById(R.id.button11);
        btn_button56=(Button)findViewById(R.id.button11);

        btn_button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}