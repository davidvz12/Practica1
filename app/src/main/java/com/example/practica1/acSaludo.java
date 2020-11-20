package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class acSaludo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_saludo);
        TextView txtSaludo = (TextView)findViewById(R.id.txtMessage);
        Bundle bundle = this.getIntent().getExtras();
        txtSaludo.setText("Hola!, Bienvenido \n " + bundle.getString("NOMBRE"));

    }
}