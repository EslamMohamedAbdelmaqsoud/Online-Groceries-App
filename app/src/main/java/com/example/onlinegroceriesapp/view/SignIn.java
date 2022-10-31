package com.example.onlinegroceriesapp.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.onlinegroceriesapp.R;
import com.hbb20.CountryCodePicker;

public class SignIn extends AppCompatActivity {
    EditText num;
    CountryCodePicker ccp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        num=findViewById(R.id.editText_carrierNumber);
        num.setOnClickListener(view -> {
            Intent intent = new Intent(this,Number.class);
            startActivity(intent);
        });
    }
}
