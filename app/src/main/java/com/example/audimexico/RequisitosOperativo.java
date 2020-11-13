package com.example.audimexico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RequisitosOperativo extends AppCompatActivity {
    Button btn_button30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requisitos_operativo);

        btn_button30=(Button)findViewById(R.id.button30);

        btn_button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}