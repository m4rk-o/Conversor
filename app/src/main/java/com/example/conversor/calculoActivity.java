package com.example.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculoActivity extends AppCompatActivity {
    TextView titulo, finalres;
    Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnCero, btnPunto, btnIgual, btnCalcular, btnBorrar;
    String t, title;
    public String mostrar;
    public double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);
        titulo = (TextView) findViewById(R.id.tvSecondtitle);
        finalres = (TextView) findViewById(R.id.textViewResultado);
        btnUno = (Button) findViewById(R.id.btn1);
        btnDos = (Button) findViewById(R.id.btn2);
        btnTres = (Button) findViewById(R.id.btn3);
        btnCuatro = (Button) findViewById(R.id.btn4);
        btnCinco = (Button) findViewById(R.id.btn5);
        btnSeis = (Button) findViewById(R.id.btn6);
        btnSiete = (Button) findViewById(R.id.btn7);
        btnOcho = (Button) findViewById(R.id.btn8);
        btnNueve = (Button) findViewById(R.id.btn9);
        btnCero = (Button) findViewById(R.id.btnCero);
        btnPunto = (Button) findViewById(R.id.btnPunto);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnCalcular = (Button) findViewById(R.id.btnRes);
        btnBorrar = (Button) findViewById(R.id.btnBorrar);

        t = getIntent().getExtras().getString("parametro");
        title = getIntent().getExtras().getString("titulo");
        titulo.setText(title);

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

        btnBorrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar.substring(0,mostrar.length()-1);
                Resultado.setText(mostrar);
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t.equals("fc")){
                    resultado = (Double.parseDouble(Resultado.getText().toString()) - 32) / 1.8;
                    finalres.setText(String.valueOf(resultado + " °C"));
                }

                if(t.equals("cf")){
                    resultado = (Double.parseDouble(Resultado.getText().toString()) * 1.8) + 32;
                    finalres.setText(String.valueOf(resultado+ " °F"));
                }
                if(t.equals("ck")){
                    resultado = Double.parseDouble(Resultado.getText().toString()) + 273;
                    finalres.setText(String.valueOf(resultado + " °K"));
                }
                if(t.equals("kc")){
                    resultado = Double.parseDouble(Resultado.getText().toString()) - 273;
                    finalres.setText(String.valueOf(resultado + " °C"));
                }
                if(t.equals("mc")){
                    resultado = Double.parseDouble(Resultado.getText().toString())  * 100;
                    finalres.setText(String.valueOf(resultado + " cm"));
                }
                if(t.equals("cm")){
                    resultado = Double.parseDouble(Resultado.getText().toString())  / 100.0;
                    finalres.setText(String.valueOf(resultado + " mts"));
                }
                if(t.equals("ci")){
                    resultado = Double.parseDouble(Resultado.getText().toString())  / 2.54;
                    finalres.setText(String.valueOf(resultado + " plg"));
                }
                if(t.equals("ic")){
                    resultado = Double.parseDouble(Resultado.getText().toString()) * 2.54;
                    finalres.setText(String.valueOf(resultado + " cms"));
                }
            }
        });
    }
}
