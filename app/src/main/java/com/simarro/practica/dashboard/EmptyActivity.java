package com.simarro.practica.dashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EmptyActivity extends AppCompatActivity implements View.OnClickListener {

    Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
        salir=findViewById(R.id.button);
        salir.setOnClickListener(this);

        String intentRecibido=getIntent().getStringExtra("descripcion");

        Toast.makeText(this,intentRecibido, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        this.finish();
    }
}
