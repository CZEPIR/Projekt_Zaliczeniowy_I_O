package com.example.projekt_zaliczeniowy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ekran_poczatkowy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekran_poczatkowy);

    }

    public void go_Ekran_gry(View view) {

        Intent Ekran_gry = new Intent(this, Ekran_gry.class);
        startActivity(Ekran_gry);
    }

}