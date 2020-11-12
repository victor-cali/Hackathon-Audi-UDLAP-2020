package com.example.audimexico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalProfesionistas extends AppCompatActivity {
    Button btn_button14,btn_button15,btn_button16,btn_button17,btn_button18,btn_button19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_profesionistas);

        btn_button14=(Button)findViewById(R.id.button14);
        btn_button15=(Button)findViewById(R.id.button15);
        btn_button16=(Button)findViewById(R.id.button16);
        btn_button17=(Button)findViewById(R.id.button17);
        btn_button18=(Button)findViewById(R.id.button18);
        btn_button19=(Button)findViewById(R.id.button19);

        btn_button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

}
}