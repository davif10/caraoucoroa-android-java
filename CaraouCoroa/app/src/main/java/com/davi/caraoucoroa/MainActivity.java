package com.davi.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button buttonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonJogar = findViewById(R.id.buttonJogar);
        buttonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getApplicationContext(),Resultado.class);
                //Passar dados para a próxima tela

                int num = new Random().nextInt(2);
                intent.putExtra("num",num);
                startActivity(intent);
            }
        });
    }
}
