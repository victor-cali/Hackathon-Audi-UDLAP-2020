package com.example.audimexico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalOperativo extends AppCompatActivity {
    Button btn_button22,btn_button23,btn_button24, btn_button25,btn_button26,btn_button27, btn_button28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_operativo);

        btn_button22= (Button)findViewById(R.id.button22);
        btn_button23= (Button)findViewById(R.id.button23);
        btn_button24= (Button)findViewById(R.id.button24);
        btn_button25= (Button)findViewById(R.id.button25);
        btn_button26= (Button)findViewById(R.id.button26);
        btn_button27= (Button)findViewById(R.id.button27);
        btn_button28= (Button)findViewById(R.id.button28);

        btn_button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}