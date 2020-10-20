package com.example.calculadora;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_divicion;
    private Button btn_multipicacion;

    private TextView text_respuesta;
    private EditText edit_numero_uno;
    private EditText edit_numero_dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_respuesta=findViewById(R.id.Respuesta);
        edit_numero_uno=findViewById(R.id.numero1);
        edit_numero_dos=findViewById(R.id.numero2);

        btn_suma=findViewById(R.id.button_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(suma(Integer.parseInt(edit_numero_uno.getText().toString()),
                        Integer.parseInt(edit_numero_dos.getText().toString()) )+"");
            }
        });

        btn_resta=findViewById(R.id.button_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(resta(Integer.parseInt(edit_numero_uno.getText().toString()),
                        Integer.parseInt(edit_numero_dos.getText().toString()) )+"");
            }
        });
        btn_divicion=findViewById(R.id.button_divicion);
        btn_divicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(divicion(Integer.parseInt(edit_numero_uno.getText().toString()),
                        Integer.parseInt(edit_numero_dos.getText().toString()) )+"");
            }
        });

        btn_multipicacion=findViewById(R.id.button_multiplicacion);
        btn_multipicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(multiplicacion(Integer.parseInt(edit_numero_uno.getText().toString()),
                        Integer.parseInt(edit_numero_dos.getText().toString()) )+"");
            }
        });
    }
    public double suma (int a, int b){
        return a+b;
    }
    public double resta (int a, int b){ return a-b;
    }
    public double divicion (int a, int b){
        int respuesta = 0;
        if (b!=0){
            respuesta=a/b;
        }
        return respuesta;
    }
    public double multiplicacion (int a, int b){
        return a*b;
    }
}