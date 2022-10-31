package com.example.onlinegroceriesapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.onlinegroceriesapp.R;


public class LogIn extends AppCompatActivity {
    Button log_in;
    TextView sign_up;
    EditText passwordedittext;
    EditText emailedittext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        log_in = findViewById(R.id.angry_btn);
        sign_up = findViewById(R.id.have1);
        emailedittext = findViewById(R.id.editTextTextEmailAddress);
        passwordedittext = findViewById(R.id.editTextTextPassword);
        log_in.setOnClickListener(view -> {
            loginUserAccount();
        });
        sign_up.setOnClickListener(view -> {
            Intent intent = new Intent(this, SignUp.class);
            startActivity(intent);
        });

    }

    private void loginUserAccount() {
        String email, password;
        email = emailedittext.getText().toString();
        password = passwordedittext.getText().toString();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Please enter email!!", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Please enter password!!", Toast.LENGTH_LONG).show();
            return;
        }


        log_in.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Login successful!!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(LogIn.this,HomeScreen.class);
            startActivity(intent);
        });


    }
}

