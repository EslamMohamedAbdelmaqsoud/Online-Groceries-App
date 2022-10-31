package com.example.onlinegroceriesapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.onlinegroceriesapp.R;

public class Number extends AppCompatActivity {
    ImageView imageView7,imageView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number);

        imageView7 = findViewById(R.id.imageView7);
        imageView11 = findViewById(R.id.imageView11);
        imageView7.setOnClickListener(view -> {
            Intent intent = new Intent(Number.this,SignIn.class);
            startActivity(intent);
        });

        imageView11.setOnClickListener(view -> {
            Intent intent = new Intent(Number.this,Verification.class);
            startActivity(intent);
        });





    }
}
