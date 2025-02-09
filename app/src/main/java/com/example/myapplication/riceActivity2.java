package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class riceActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice2);

        CardView exit= findViewById(R.id.Back);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(riceActivity2.this,HomeActivity2.class));

            }
        });

        CardView Chickenrice= findViewById(R.id.Chickenrice);
        Chickenrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(riceActivity2.this,OrderDtlsActivity2.class));

            }
        });
        CardView Mixrice= findViewById(R.id.Mixrice);
        Mixrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(riceActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView Seafoodricey= findViewById(R.id.Seafoodrice);
        Seafoodricey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(riceActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView Vegitablerice= findViewById(R.id.Vegitablerice);
        Vegitablerice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(riceActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView Porkrice= findViewById(R.id.Porkrice);
        Porkrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(riceActivity2.this,OrderDtlsActivity2.class));

            }
        });
    }
}