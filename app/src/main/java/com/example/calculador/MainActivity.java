package com.example.calculador;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    TextView resultado, total;

    Button cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, dividir, restar, sumar, multiplicar, C;
    boolean bracket = false;
    String proceso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Inicial();



    }

    public void Inicial(){
        resultado = findViewById(R.id.process);
        total = findViewById(R.id.result);

        cero = findViewById(R.id.cero);
        uno = findViewById(R.id.uno);
        dos = findViewById(R.id.dos);
        tres = findViewById(R.id.tres);
        cuatro = findViewById(R.id.cuatro);
        cinco = findViewById(R.id.cinco);
        seis = findViewById(R.id.seis);
        siete = findViewById(R.id.siete);
        ocho = findViewById(R.id.ocho);
        nueve = findViewById(R.id.nueve);


        sumar = findViewById(R.id.suma);
        multiplicar = findViewById(R.id.multiplicar);
        restar = findViewById(R.id.restar);
        dividir = findViewById(R.id.dividir);
        C = findViewById(R.id.btn_clear);
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText("");
                total.setText("");
            }
        });


        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "0");
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "1");
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "2");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "3");
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "4");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "6");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "7");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "8");
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "9");
            }
        });


        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "+");
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "x");
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "/");
            }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "-");

            }
        });


    }
    public void igual(View view) {


        proceso = resultado.getText().toString();
        proceso = proceso.replaceAll("x", "*");


        Context context = Context.enter();
        context.setOptimizationLevel(-1);

        String finalResut = "";

        try {
            Scriptable scriptable = context.initStandardObjects();
            finalResut = context.evaluateString(scriptable, proceso, "javascript", 1, null).toString();


        }catch (Exception e){
            finalResut="0";

        }
        total.setText(finalResut);
    }




}
