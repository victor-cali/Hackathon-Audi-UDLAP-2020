package com.example.audimexico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

public class FuturoEmpleo extends AppCompatActivity {

    Button btn_button9,btn_button10,btn_button11;

    Spinner opciones1, opciones2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futuro_empleo);

        btn_button9=(Button)findViewById(R.id.button9);
        btn_button10=(Button)findViewById(R.id.button10);
        btn_button11=(Button)findViewById(R.id.button11);

        opciones1 = (Spinner) findViewById(R.id.sp1);
        opciones2 = (Spinner) findViewById(R.id.sp2);

        btn_button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btn_button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btn_button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        ArrayAdapter<CharSequence>adapter= ArrayAdapter.createFromResource(this, R.array.opciones1, android.R.layout.simple_spinner_item);
        opciones1.setAdapter(adapter);

        ArrayAdapter<CharSequence>adapter2= ArrayAdapter.createFromResource(this, R.array.opciones2, android.R.layout.simple_spinner_item);
        opciones2.setAdapter(adapter2);
    }
}