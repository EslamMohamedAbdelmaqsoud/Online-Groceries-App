package com.example.onlinegroceriesapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.onlinegroceriesapp.R;

public class Verification extends AppCompatActivity {
    ImageView imageView16,imageView19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification);

        imageView16 = findViewById(R.id.imageView16);
        imageView19 = findViewById(R.id.imageView19);
        imageView16.setOnClickListener(view -> {
            Intent intent = new Intent(Verification.this,Number.class);
            startActivity(intent);
        });

        imageView19.setOnClickListener(view -> {
            Intent intent = new Intent(Verification.this,SelectLocation.class);
            startActivity(intent);

        });





    }
}
