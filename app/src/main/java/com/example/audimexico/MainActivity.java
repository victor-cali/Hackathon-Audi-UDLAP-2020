package com.example.audimexico;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.amplifyframework.core.Amplify;

public class MainActivity extends AppCompatActivity {

    Button btn_conocenos, btn_noticias, btn_bolsa_de_trabajo, btn_soporte_tecnico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Amplify.Auth.fetchAuthSession(
                result -> Log.i("AmplifyQuickstart", result.toString()),
                error -> Log.e("AmplifyQuickstart", error.toString())
        );

        btn_conocenos = findViewById(R.id.btnconocenos);
        btn_noticias = findViewById(R.id.btnnoticias);
        btn_bolsa_de_trabajo = findViewById(R.id.btnbolsa_de_trabajo);
        btn_soporte_tecnico = findViewById(R.id.btnsoporte_tecnico);

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