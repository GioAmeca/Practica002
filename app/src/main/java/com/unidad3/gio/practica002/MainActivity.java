package com.unidad3.gio.practica002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 EditText cuadro,numerouno,numerodos;
    float a,b,resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cuadro=(EditText)findViewById(R.id.TxtResul);
        numerouno=(EditText)findViewById(R.id.Txta);
        numerodos=(EditText)findViewById(R.id.Txtb);


    }



    public void suma(View v){
        a=Float.parseFloat(String.valueOf(numerouno.getText()));
        b=Float.parseFloat(String.valueOf(numerodos.getText()));
        resultado=a+b;
        cuadro.setText(Float.toString(resultado));
    }
    public void resta(View v){
        a=Float.parseFloat(String.valueOf(numerouno.getText()));
        b=Float.parseFloat(String.valueOf(numerodos.getText()));
        resultado=a-b;
        cuadro.setText(Float.toString(resultado));
    }
    public void divi(View v){
        a=Float.parseFloat(String.valueOf(numerouno.getText()));
        b=Float.parseFloat(String.valueOf(numerodos.getText()));
        if(b==0){
            cuadro.setText("No se puede dividir entre 0");
        }
        else{
        resultado=a/b;
        cuadro.setText(Float.toString(resultado));
        }
    }
    public void multi(View v){
        a=Float.parseFloat(String.valueOf(numerouno.getText()));
        b=Float.parseFloat(String.valueOf(numerodos.getText()));
        resultado=a*b;
        cuadro.setText(Float.toString(resultado));
    }
}
