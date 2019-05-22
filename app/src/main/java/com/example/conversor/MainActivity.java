package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button CelFar, FarCel, Celkel, kelCel, metcenti, centmeter, centinch, inchcenti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CelFar = (Button) findViewById(R.id.btnCelFar);
        FarCel = (Button) findViewById(R.id.btnFarCel);
        Celkel = (Button) findViewById(R.id.btnCelKel);
        kelCel = (Button) findViewById(R.id.btnkelCel);
        metcenti = (Button) findViewById(R.id.btnmetercenti);
        centmeter = (Button) findViewById(R.id.btnCentimeter);
        centinch = (Button) findViewById(R.id.btnCentiInch);
        inchcenti = (Button) findViewById(R.id.btnInchCenti);
        CelFar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "cf");
                intent.putExtra("titulo", CelFar.getText());
                startActivityForResult(intent, 0);
            }
        });

        FarCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "fc");
                intent.putExtra("titulo", FarCel.getText());
                startActivityForResult(intent, 0);
            }
        });

        Celkel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "ck");
                intent.putExtra("titulo", kelCel.getText());
                startActivityForResult(intent, 0);
            }
        });

        kelCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "kc");
                intent.putExtra("titulo", kelCel.getText());
                startActivityForResult(intent, 0);
            }
        });

        metcenti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "mc");
                intent.putExtra("titulo", metcenti.getText());
                startActivityForResult(intent, 0);
            }
        });

        centmeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "cm");
                intent.putExtra("titulo", centmeter.getText());
                startActivityForResult(intent, 0);
            }
        });

        centinch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "ci");
                intent.putExtra("titulo", centinch.getText());
                startActivityForResult(intent, 0);
            }
        });

        inchcenti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), calculoActivity.class);
                intent.putExtra("parametro", "ic");
                intent.putExtra("titulo", inchcenti.getText());
                startActivityForResult(intent, 0);
            }
        });
    }
}
