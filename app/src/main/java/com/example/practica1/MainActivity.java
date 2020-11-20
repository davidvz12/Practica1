package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btEnviar(View view){
        Intent intent = new Intent(this, acSaludo.class);
        EditText txtNombre = (EditText)findViewById(R.id.txtName);
        Bundle b = new Bundle();
        b.putString("NOMBRE", txtNombre.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
     }

}