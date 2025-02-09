package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "").toString();
        Toast.makeText(getApplicationContext(), "welcome" + username, Toast.LENGTH_SHORT).show();

        CardView exit = findViewById(R.id.Food5);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(HomeActivity2.this, LoginActivity.class));

            }
        });
        CardView RiceAndCurry = findViewById(R.id.Food); // Change RiceAndCurry to Food
        RiceAndCurry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity2.this, RiceAndCurryActivity2.class));
            }
        });
        CardView rice = findViewById(R.id.Food1); // Change RiceAndCurry to Food
        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity2.this, riceActivity2.class));
            }
        });
        CardView Burger = findViewById(R.id.Food2); // Change RiceAndCurry to Food
        Burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity2.this, BurgerActivity2.class));
            }
        });
        CardView Beverages = findViewById(R.id.Food3); // Change RiceAndCurry to Food
        Beverages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity2.this, BeveragesActivity2.class));
            }
        });
        CardView Cake = findViewById(R.id.Food4); // Change RiceAndCurry to Food
        Cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity2.this, CakeActivity2.class));
            }
        });

    }
}







