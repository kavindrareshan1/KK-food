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

public class BeveragesActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages2);

        CardView exit= findViewById(R.id.Back);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeveragesActivity2.this,HomeActivity2.class));

            }
        });

        CardView peachicetea= findViewById(R.id.PeachIceTea);
        peachicetea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeveragesActivity2.this,OrderDtlsActivity2.class));

            }
        });
        CardView MixriceHomeMadeGingerBeer= findViewById(R.id.HomeMadeGingerBeer);
        MixriceHomeMadeGingerBeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeveragesActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView StrawberryIceTea= findViewById(R.id.StrawberryIceTea);
        StrawberryIceTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeveragesActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView MintLimeJuice= findViewById(R.id.MintLimeJuice);
        MintLimeJuice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeveragesActivity2.this,OrderDtlsActivity2.class));

            }
        });

        CardView ChocolateMilkShake= findViewById(R.id.ChocolateMilkShake);
        ChocolateMilkShake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeveragesActivity2.this,OrderDtlsActivity2.class));

            }
        });
    }
}