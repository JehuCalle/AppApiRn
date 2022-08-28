package com.example.appapirn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import com.example.appapirn.includes.MyToolbar;

public class Activity_P2 extends AppCompatActivity {

    Button siguiente2;
    Button vibrar;
    Button mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);
        MyToolbar.show(this,"Ejemplos",true);


        siguiente2=(Button)findViewById(R.id.Btn_P1);
        siguiente2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( Activity_P2.this, MainActivity.class);
                startActivity(i);
            }

        });

        vibrar=(Button)findViewById(R.id.Btn_Vibrar);
        vibrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator vibrar = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrar.vibrate(1000);
            }
        });

        mapa=(Button)findViewById(R.id.Btn_Map);
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( Activity_P2.this, MapsActivity.class);
                startActivity(i);
            }
        });
    }
}