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

public class BurgerActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger2);

        CardView exit= findViewById(R.id.Back);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BurgerActivity2.this,HomeActivity2.class));

            }


        });

        CardView BeefBurger= findViewById(R.id.BeefBurger);
        BeefBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BurgerActivity2.this,OrderDtlsActivity2.class));

            }
        });
        CardView CheesBurger= findViewById(R.id.CheeseBurger);
        CheesBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BurgerActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView BBQChicken= findViewById(R.id.BBQChicken);
        BBQChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BurgerActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView CrispyChicken= findViewById(R.id.CrispyChicken);
        CrispyChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BurgerActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView HawaiianBurger= findViewById(R.id.HawaiianBurger);
        HawaiianBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BurgerActivity2.this,OrderDtlsActivity2.class));

            }
        });
    }
}