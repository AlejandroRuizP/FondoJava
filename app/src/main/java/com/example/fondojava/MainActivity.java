package com.example.fondojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button Boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Boton = (Button) findViewById(R.id.Boton) ;
        Boton.setOnClickListener(this);

       textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        Boton.setBackgroundColor(Color.rgb(generarNum(), generarNum(), generarNum()));
        Boton.setTextColor(Color.rgb(generarNum(), generarNum(), generarNum()));
        textView.setBackgroundColor(Color.rgb(generarNum(), generarNum(), generarNum()));  // COMO SE CAMBIAR SIN PONER UN LAYOUT????




    }

    public int generarNum() {
        int numero = (int)(Math.random()*255+1);
        return  numero;

    }
}