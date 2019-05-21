package com.example.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculoActivity extends AppCompatActivity {
    TextView titulo = findViewById(R.id.tvSecondtitle);
    Button btnUno = findViewById(R.id.btn1);
    Button btnDos = findViewById(R.id.btn2);
    Button btnTres = findViewById(R.id.btn3);
    Button btnCuatro = findViewById(R.id.btn4);
    Button btnCinco = findViewById(R.id.btn5);
    Button btnSeis = findViewById(R.id.btn6);
    Button btnSiete = findViewById(R.id.btn7);
    Button btnOcho = findViewById(R.id.btn8);
    Button btnNueve = findViewById(R.id.btn9);
    Button btnCero = findViewById(R.id.btnCero);
    Button btnPunto = findViewById(R.id.btnPunto);
    Button btnIgual = findViewById(R.id.btnIgual);

    public String mostrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        String t = getIntent().getExtras().getString("parametro");
        titulo.setText(t);

        final EditText Resultado = findViewById(R.id.editTextValor);

        btnUno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                Resultado.setText(mostrar);
            }
        });
        btnDos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "2";
                Resultado.setText(mostrar);
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "3";
                Resultado.setText(mostrar);
            }
        });
        btnCuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "4";
                Resultado.setText(mostrar);
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "5";
                Resultado.setText(mostrar);
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "6";
                Resultado.setText(mostrar);
            }
        });
        btnSiete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "7";
                Resultado.setText(mostrar);
            }
        });
        btnOcho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "8";
                Resultado.setText(mostrar);
            }
        });
        btnNueve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "9";
                Resultado.setText(mostrar);
            }
        });

        btnCero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "0";
                Resultado.setText(mostrar);
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + ".";
                Resultado.setText(mostrar);
            }
        });
    }
}
