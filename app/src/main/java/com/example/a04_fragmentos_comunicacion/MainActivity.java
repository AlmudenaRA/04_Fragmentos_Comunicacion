package com.example.a04_fragmentos_comunicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnControlesFragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.contenedor, new ControlesFragment())
                .commit();
    }

    @Override
    public void botonColorClicked(String color) {
        Toast toast1 = Toast.makeText(this, "Estoy en el activity, color recibido: "+color, Toast.LENGTH_SHORT);
        toast1.show();
    }

    @Override
    public void botonTextoClicke(String texto) {
        Toast toast1 = Toast.makeText(this, "Estoy en el activity, texto recibido: "+texto, Toast.LENGTH_SHORT);
        toast1.show();
    }

    @Override
    public void mensaje(String texto) {
        
    }
}
