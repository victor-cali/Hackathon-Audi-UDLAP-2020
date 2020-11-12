package com.example.audimexico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bolsa extends AppCompatActivity {
    Button btn_button,btn_button2,btn_button3,btn_button4,btn_button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolsa);

        btn_button=(Button)findViewById(R.id.button);
        btn_button2=(Button)findViewById(R.id.button2);
        btn_button3=(Button)findViewById(R.id.button3);
        btn_button4=(Button)findViewById(R.id.button4);
        btn_button5=(Button)findViewById(R.id.button5);

        btn_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }
}
