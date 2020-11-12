package com.example.audimexico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Registro extends AppCompatActivity {
    Button btn_button6, btn_button7;
    CheckBox c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        c1=findViewById(R.id.checkBox);

        btn_button6=(Button)findViewById(R.id.button6);
        btn_button7=(Button)findViewById(R.id.button7);

        btn_button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

}