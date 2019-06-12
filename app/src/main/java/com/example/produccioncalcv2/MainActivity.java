package com.example.produccioncalcv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextVelocidad;
    private EditText editTextAnillos;
    private EditText editTextTiempo;
    private EditText editTextEficiencia;
    private EditText editTextPiezas;
    private Button buttonP1;
    private TextView textViewTarimas;
    private TextView textViewPaquetes;
    private EditText editTextPaquetesTarima;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextVelocidad = findViewById(R.id.editText_vel);
        editTextAnillos = findViewById(R.id.editText_anillos);
        editTextTiempo = findViewById(R.id.editText_tiempo);
        editTextEficiencia = findViewById(R.id.editText_eficiencia);
        editTextPiezas = findViewById(R.id.editText_piezas);
        buttonP1 = findViewById(R.id.button_P1);
        textViewPaquetes = findViewById(R.id.textView_paquetes);
        textViewTarimas = findViewById(R.id.textView_tarimas);
        editTextPaquetesTarima = findViewById(R.id.editText_paquetesTarima);



        buttonP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int vel = Integer.parseInt(editTextVelocidad.getText().toString());
                int ani = Integer.parseInt(editTextAnillos.getText().toString());
                int tmp = Integer.parseInt(editTextTiempo.getText().toString());
                float efi = Float.parseFloat(editTextEficiencia.getText().toString());
                int pza = Integer.parseInt(editTextPiezas.getText().toString());
                float tar = Float.parseFloat(editTextPaquetesTarima.getText().toString());




                float resultadoPaquetes = ((vel*ani*tmp)*efi)/ pza;
                float tarimas = resultadoPaquetes/tar;
                textViewPaquetes.setText(String.valueOf(resultadoPaquetes) + "Paquetes");
                textViewTarimas.setText(String.valueOf(tarimas)+ "Tarimas");


            }
        });







    }
}
