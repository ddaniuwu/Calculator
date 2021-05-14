package com.example.calculator;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_dividir;
    private Button btn_multiplicar;

    private TextView text_respuesta;

    private EditText edit_numero_uno;
    private EditText edit_numero_dos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.text_respuesta);

        edit_numero_uno = findViewById(R.id.num1);
        edit_numero_dos = findViewById(R.id.num2);

        btn_suma = findViewById(R.id.btn_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              text_respuesta.setText(suma(Integer.parseInt(edit_numero_uno.getText().toString()) ,
                Integer.parseInt(edit_numero_dos.getText().toString()))+"");

            }
        });
        btn_resta = findViewById(R.id.btn_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(resta(Integer.parseInt(edit_numero_uno.getText().toString()) ,
                        Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });
        btn_dividir = findViewById(R.id.btn_dividir);

        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(dividir(Integer.parseInt(edit_numero_uno.getText().toString()) ,
                        Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });
        btn_multiplicar = findViewById(R.id.btn_multiplicar);
        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(multiplicar(Integer.parseInt(edit_numero_uno.getText().toString()) ,
                        Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });


    }

    public  int suma(int a,int b){
        return  a+b;
    }
    public  int resta(int a,int b){
        return  a-b;
    }
    public  int multiplicar(int a,int b){
        return  a*b;
    }
    public  int dividir(int a,int b){
        return  a/b;
    }
}