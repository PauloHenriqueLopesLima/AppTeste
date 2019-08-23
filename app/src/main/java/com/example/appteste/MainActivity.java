package com.example.appteste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText altura;
    private TextInputEditText peso;
    private Button calcular;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        altura = findViewById(R.id.altura);
        peso = findViewById(R.id.peso);
        calcular = findViewById(R.id.calcular);
        resultado = findViewById(R.id.resultado);


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float pesopassado = Float.parseFloat(peso.getEditableText().toString());
                float alturapassada = Float.parseFloat(altura.getEditableText().toString());

                float resultadoesperado = MainActivity.this.calcularImc(pesopassado, alturapassada);
                resultado.setText("o resultado e: " +resultadoesperado);
            }
        });
    }

    public float calcularImc(float peso, float altura) {
        return peso/(altura*altura);
    }
}
