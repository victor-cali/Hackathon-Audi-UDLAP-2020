package com.example.audimexico;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Bolsa extends AppCompatActivity {
    Button btn_button, btn_button2, btn_button3, btn_button4, btn_button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolsa);

        btn_button = findViewById(R.id.button);
        btn_button2 = findViewById(R.id.button2);
        btn_button3 = findViewById(R.id.button3);
        btn_button4 = findViewById(R.id.button4);
        btn_button5 = findViewById(R.id.button5);
    }

    public void onClick(View view) {
        Intent btn_intent = null;
        switch (view.getId()) {
            case R.id.button:
                btn_intent = new Intent(Bolsa.this, MainActivity.class);
                break;
            case R.id.button2:
                btn_intent = new Intent(Bolsa.this, Login.class);
                break;
            case R.id.button3:
                btn_intent = new Intent(Bolsa.this, Registro.class);
                break;
            case R.id.button4:
                btn_intent = new Intent(Bolsa.this, PrincipalProfesionistas.class);
                break;
            case R.id.button5:
                btn_intent = new Intent(Bolsa.this, PrincipalOperativo.class);
                break;
            default:
                Context context = getApplicationContext();
                CharSequence text = "Unexpected error";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
        }
        startActivity(btn_intent);
    }
}