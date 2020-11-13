package com.example.audimexico;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import com.amplifyframework.core.Amplify;

public class Registro extends AppCompatActivity {
    Button btn_button6, btn_button63;
    private EditText name, mail, pass1, pass2;
    private String username = name.getText().toString();
    private String email = mail.getText().toString();
    private String password1 = pass1.getText().toString();
    private String password2 = pass2.getText().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        name = findViewById(R.id.editTextTextPersonName);
        mail = findViewById(R.id.editTextTextPersonName4);
        pass1 = findViewById(R.id.editTextTextPersonName6);
        pass1 = findViewById(R.id.editTextTextPersonName7);
        btn_button6 = findViewById(R.id.button6);
        btn_button63 = findViewById(R.id.button63);
    }

    public void onClick(View view) {
        Intent btn_intent = null;
        Context context = getApplicationContext();
        CharSequence text;
        int duration;
        Toast toast;

        switch (view.getId()) {
            case R.id.button6:
                btn_intent = new Intent(Registro.this, MainActivity.class);
                startActivity(btn_intent);
                break;
            case R.id.button63:
                registation();
                text = "Registro exitoso";
                duration = Toast.LENGTH_LONG;
                toast = Toast.makeText(context, text, duration);
                toast.show();
                btn_intent = new Intent(Registro.this, Login.class);
                startActivity(btn_intent);
                break;
            default:
                text = "Problema inesperado";
                duration = Toast.LENGTH_LONG;
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
        }
    }

    private void registation() {
        username = name.getText().toString();
        email = mail.getText().toString();
        password1 = pass1.getText().toString();
        password2 = pass2.getText().toString();
        if (password1.equals(password2) && !password1.isEmpty()) {
            Amplify.Auth.signUp(username,
                    password1,
                    AuthSignUpOptions.builder().userAttribute(AuthUserAttributeKey.email(), email).build(),
                    result -> Log.i("AuthQuickStart", "Result: " + result.toString()),
                    error -> Log.e("AuthQuickStart", "Sign up failed", error)
            );
            confirm_dialog();
        } else {
            Context context = getApplicationContext();
            CharSequence text = "Problemas con la contraseña";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    private void confirm_registration(String confirmation) {
        Amplify.Auth.confirmSignUp(
                username,
                confirmation,
                result -> Log.i("AuthQuickstart", result.isSignUpComplete() ? "Confirm signUp succeeded" : "Confirm sign up not complete"),
                error -> Log.e("AuthQuickstart", error.toString())
        );
    }

    private void confirm_dialog() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Confirmación");
        alert.setMessage("Ingresa el código que recibiste por email");
        // Set an EditText view to get user input
        final EditText input = new EditText(this);
        alert.setView(input);
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                String code = input.getText().toString();
                confirm_registration(code);
            }
        });
        alert.show();
    }
}