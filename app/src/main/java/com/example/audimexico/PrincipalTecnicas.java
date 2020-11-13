package com.example.audimexico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalTecnicas extends AppCompatActivity {
    Button btn_button38,btn_button39,btn_button40,btn_button41,btn_button42,btn_button43,btn_button44,btn_button45;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_tecnicas);
        btn_button38=(Button)findViewById(R.id.button38);
        btn_button39=(Button)findViewById(R.id.button39);
        btn_button40=(Button)findViewById(R.id.button40);
        btn_button41=(Button)findViewById(R.id.button41);
        btn_button42=(Button)findViewById(R.id.button42);
        btn_button43=(Button)findViewById(R.id.button43);
        btn_button44=(Button)findViewById(R.id.button44);
        btn_button45=(Button)findViewById(R.id.button45);

        btn_button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}