package com.example.callesemetienearto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView re;
    EditText Pass,Name,Respuesta;
    Button Ubicacion,validar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.Name);
        Pass = (EditText)findViewById(R.id.Pass);
        Respuesta = (EditText)findViewById(R.id.letter);





        Ubicacion = (Button) findViewById(R.id.Ubicacion);
        Ubicacion.setOnClickListener(v -> {
            Intent mapa = new Intent(this,mapa.class);
            startActivity(mapa);
        });

        validar = (Button) findViewById(R.id.Ingresar);
        validar.setOnClickListener(v -> {

            float Nombre,Contraseña;


            Contraseña =  Float.parseFloat(Pass.getText().toString());
            Nombre =  Float.parseFloat(Name.toString().toString());
            Respuesta.setText("El Resultado es: " + Name);

            return;
        });



    }

    @Override
    public void onClick(View view) {
    /*
            float Nombre,Contraseña;


            Contraseña =  Float.parseFloat(Pass.getText().toString());
            Nombre =  Float.parseFloat(Name.toString().toString());



        switch (view.getId()){
            case R.id.Ingresar:

            Respuesta.setText("El Resultado es: " + Name);
        }

        */

    }
}