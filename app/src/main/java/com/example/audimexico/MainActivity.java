package com.example.audimexico;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
        btn_conocenos = findViewById(R.id.btn_conocenos);
        btn_noticias = findViewById(R.id.btn_noticias);
        btn_bolsa_de_trabajo = findViewById(R.id.btn_bolsa_de_trabajo);
        btn_soporte_tecnico = findViewById(R.id.btn_soporte_tecnico);
    }

    public void onClick(View view) {
        Intent btn_intent = null;
        switch (view.getId()) {
            case R.id.btn_login:
                btn_intent = new Intent(MainActivity.this, Login.class);
                startActivity(btn_intent);
                break;
            case R.id.btn_bolsa_de_trabajo:
                btn_intent = new Intent(MainActivity.this, Bolsa.class);
                startActivity(btn_intent);
                break;
            default:
                Context context = getApplicationContext();
                CharSequence text = "Aún no disponible";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
        }

    }
}