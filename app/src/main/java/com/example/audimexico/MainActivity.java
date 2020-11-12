package com.example.audimexico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_conocenos, btn_noticias, btn_bolsa_de_trabajo, btn_soporte_tecnico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_conocenos= (Button) findViewById(R.id.btnconocenos);
        btn_noticias=(Button) findViewById(R.id.btnnoticias);
        btn_bolsa_de_trabajo=(Button) findViewById(R.id.btnbolsa_de_trabajo);
        btn_soporte_tecnico=(Button) findViewById(R.id.btnsoporte_tecnico);

        btn_conocenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_noticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_bolsa_de_trabajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_soporte_tecnico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}