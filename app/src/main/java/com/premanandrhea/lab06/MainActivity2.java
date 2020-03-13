package com.premanandrhea.lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button onedi, pm, bangtan, oldies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        onedi = findViewById(R.id.oned);
        pm = findViewById(R.id.prettymuch);
        bangtan = findViewById(R.id.answer1);
        oldies = findViewById(R.id.bb);

        onedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCol(onedi, bangtan);
            }
        });

        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCol(pm, bangtan);
            }
        });

        bangtan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCol(bangtan, bangtan);
            }
        });

        oldies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCol(oldies, bangtan);
            }
        });

    }
    public void setCol(Button chose, Button right){
        right.setBackgroundColor(Color.GREEN);
        if(right != chose){
            chose.setBackgroundColor(Color.RED);
        }
    }
}
