package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button CelFar = findViewById(R.id.btnCelFar);
    Button FarCel = findViewById(R.id.btnFarCel);
    Button Celkel = findViewById(R.id.btnCelKel);
    Button kelCel = findViewById(R.id.btnkelCel);

    Button metcenti = findViewById(R.id.btnmetercenti);
    Button centmeter = findViewById(R.id.btnCentimeter);
    Button centinch = findViewById(R.id.btnCentiInch);
    Button inchcenti = findViewById(R.id.btnInchCenti);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CelFar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "cf");
                startActivityForResult(intent, 0);
            }
        });

        FarCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "fc");
                startActivityForResult(intent, 0);
            }
        });

        Celkel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "ck");
                startActivityForResult(intent, 0);
            }
        });

        kelCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "kc");
                startActivityForResult(intent, 0);
            }
        });

        metcenti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "mc");
                startActivityForResult(intent, 0);
            }
        });

        centmeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "cm");
                startActivityForResult(intent, 0);
            }
        });

        centinch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "ci");
                startActivityForResult(intent, 0);
            }
        });

        inchcenti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "ic");
                startActivityForResult(intent, 0);
            }
        });
    }
}
