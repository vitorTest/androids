package com.chptr1.flixlix.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edtText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtText = (EditText) findViewById(R.id.editText);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        Button buttonTela2 = (Button) findViewById(R.id.button2);
        buttonTela2.setOnClickListener(this);

        Button buttonTela2Parcelable = (Button) findViewById(R.id.button3);
        buttonTela2Parcelable.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button:
                String text = edtText.getText().toString();
                text = text + " hue";
                Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Intent it = new Intent(this, Tela2Activity.class);
                it.putExtra("nome", "Vitor");
                it.putExtra("idade", 24);
                startActivity(it);
                break;
            case R.id.button3:
                Cliente cliente = new Cliente(1, "Vitor");
        }

    }
}
