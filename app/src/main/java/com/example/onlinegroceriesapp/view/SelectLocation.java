package com.example.onlinegroceriesapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.onlinegroceriesapp.R;


public class SelectLocation extends AppCompatActivity {
    ImageView imageView22;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_location);

        imageView22 = findViewById(R.id.imageView22);
        submit = findViewById(R.id.submit);
        imageView22.setOnClickListener(view -> {
            Intent intent = new Intent(SelectLocation.this,Verification.class);
            startActivity(intent);
        });

        submit.setOnClickListener(view -> {
            Intent intent = new Intent(SelectLocation.this,LogIn.class);
            startActivity(intent);

        });

//        ده كود Spinner
        String[] lang = {"Egypt","Afghanistan","Armenia","France","Kuwait","...... "};
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,lang);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(SelectLocation.this, "Hello", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //ده كود Spinner

        //        ده كود Spinner
        String[] lang1 = {"Cairo","Alex","Zag","Khanka","Elmarg","...... "};
        ArrayAdapter<String> adapter1= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,lang1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner1 = findViewById(R.id.spinner2);
        spinner1.setAdapter(adapter1);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(SelectLocation.this, "Hello", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //ده كود Spinner





    }
}
