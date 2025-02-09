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

public class RiceAndCurryActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice_and_curry2);

        CardView exit= findViewById(R.id.Back);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RiceAndCurryActivity2.this,HomeActivity2.class));

            }
        });
        CardView fishriceandcurry= findViewById(R.id.FishRiceAndCurry);
        fishriceandcurry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RiceAndCurryActivity2.this,OrderDtlsActivity2.class));

            }
        });
        CardView chickenriceandcurry= findViewById(R.id.ChickenRiceAndCurry);
        chickenriceandcurry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RiceAndCurryActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView EggRiceAndCurry= findViewById(R.id.EggRiceAndCurry);
        EggRiceAndCurry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RiceAndCurryActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView VegitableRiceAndCurry= findViewById(R.id.VegitableRiceAndCurry);
        VegitableRiceAndCurry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RiceAndCurryActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView PorkRiceAndCurry= findViewById(R.id.PorkRiceAndCurry);
        PorkRiceAndCurry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RiceAndCurryActivity2.this,OrderDtlsActivity2.class));

            }
        });






    }
}