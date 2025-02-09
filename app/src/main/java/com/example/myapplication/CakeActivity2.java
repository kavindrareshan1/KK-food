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

public class CakeActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake2);

        CardView exit= findViewById(R.id.Back);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CakeActivity2.this,HomeActivity2.class));

            }
        });
        CardView ChocolateCreamCake= findViewById(R.id.ChocolateCreamCake);
        ChocolateCreamCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CakeActivity2.this,OrderDtlsActivity2.class));

            }
        });
        CardView WhiteGrapeCreamCake= findViewById(R.id.WhiteGrapeCreamCake);
        WhiteGrapeCreamCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CakeActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView TiramisuCake= findViewById(R.id.TiramisuCake);
        TiramisuCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CakeActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView MangoBeerCak= findViewById(R.id.MangoBeerCake);
        MangoBeerCak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CakeActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView TaroLavaCake= findViewById(R.id.TaroLavaCake);
        TaroLavaCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CakeActivity2.this,OrderDtlsActivity2.class));

            }
        });
    }
}