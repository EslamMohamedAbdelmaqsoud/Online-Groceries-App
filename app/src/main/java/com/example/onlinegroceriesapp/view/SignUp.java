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


public class SignUp extends AppCompatActivity {
    Button sign_up;
    TextView sign_in;
    EditText passwordedittext;
    EditText emailedittext;
    EditText username1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        sign_up = findViewById(R.id.angry_btn2);
        sign_in = findViewById(R.id.don_t_have1_);
        emailedittext = findViewById(R.id.editTextText5);
        passwordedittext = findViewById(R.id.editTextTextPassword1);
        username1 = findViewById(R.id.editTextTextEmailAddress);
        sign_up.setOnClickListener(view -> {
            registerNewUser();
        });
        sign_in.setOnClickListener(view -> {
            Intent intent = new Intent(this, LogIn.class);
            startActivity(intent);
        });
    }


    private void registerNewUser() {
        String email, password,username;
        email = emailedittext.getText().toString();
        password = passwordedittext.getText().toString();
        username = username1.getText().toString();

        if (TextUtils.isEmpty(username)) {
            Toast.makeText(getApplicationContext(), "Please enter username!!", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Please enter email!!", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Please enter password!!", Toast.LENGTH_LONG).show();
            return;
        }




        sign_up.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "SignUp successful!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(SignUp.this, LogIn.class);
            startActivity(intent);
        });


    }
}

