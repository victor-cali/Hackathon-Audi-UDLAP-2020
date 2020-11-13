package com.example.audimexico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button btn_button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_button8 = findViewById(R.id.button8);
    }

    public void onClick(View view) {
        Intent btn_intent = null;
        switch (view.getId()) {
            case R.id.button62:
                btn_intent = new Intent(Login.this, Bolsa.class);
                break;
            case R.id.button8:
                break;
            default:

        }
    }

}

