package com.simarro.practica.dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton[]listabotones= new ImageButton[6];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listabotones[0]=findViewById(R.id.imgbtn1);
        listabotones[1]=findViewById(R.id.imgbtn2);
        listabotones[2]=findViewById(R.id.imgbtn3);
        listabotones[3]=findViewById(R.id.imgbtn4);
        listabotones[4]=findViewById(R.id.imgbtn6);
        listabotones[5]=findViewById(R.id.imgbtn6);

        añadirEventos(listabotones);

    }

    private void añadirEventos(ImageButton[] listabotones) {
        for (int i=0;i<listabotones.length;i++){
                listabotones[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intento=new Intent(this,EmptyActivity.class);
        intento.putExtra("descripcion",v.getContentDescription());
        startActivity(intento);
    }
}
