package com.example.perro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edad = findViewById(R.id.edad_input);
        TextView resultado = findViewById(R.id.resultado);
        Button boton = findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edadtxt = edad.getText().toString();
                int edad = Integer.parseInt(edadtxt);
                resultado.setText("Si fueras perro tu edad seria de " + (edad*7) + " años");
            }
        });
    }
}
