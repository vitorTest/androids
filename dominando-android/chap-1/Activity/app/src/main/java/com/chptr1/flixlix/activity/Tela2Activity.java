package com.chptr1.flixlix.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Intent it = getIntent();
        String nome = it.getStringExtra("nome");
        int idade =it.getIntExtra("idade", -1);
        TextView txt = (TextView)findViewById(R.id.txtTexto);
        txt.setText(String.format("Nome: %s / Idade: %d", nome, idade));
    }
}
