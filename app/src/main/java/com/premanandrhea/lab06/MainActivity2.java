package com.premanandrhea.lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button onedi, pm, bangtan, oldies;
    Button luv, ts, eas, king;
    Button grande, perry, sel, swift;
    Button horan, styles, pain, tom;
    Button jlo, lizz, card, nick;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        score = 0;

        onedi = findViewById(R.id.oned);
        pm = findViewById(R.id.prettymuch);
        bangtan = findViewById(R.id.answer1);
        oldies = findViewById(R.id.bb);

        button(onedi, bangtan);
        button(pm, bangtan);
        button(bangtan, bangtan);
        button(oldies, bangtan);

        luv = findViewById(R.id.answer2);
        ts = findViewById(R.id.troye);
        eas = findViewById(R.id.easy);
        king = findViewById(R.id.prince);

        button(luv, luv);
        button(ts, luv);
        button(eas, luv);
        button(king, luv);

        grande = findViewById(R.id.ari);
        perry = findViewById(R.id.katy);
        sel = findViewById(R.id.selgo);
        swift = findViewById(R.id.answer3);

        button(grande, swift);
        button(perry, swift);
        button(sel, swift);
        button(swift, swift);

        horan = findViewById(R.id.niall);
        styles = findViewById(R.id.answer4);
        pain = findViewById(R.id.liam);
        tom = findViewById(R.id.louis);

        button(horan, styles);
        button(styles, styles);
        button(pain, styles);
        button(tom, styles);

        jlo = findViewById(R.id.jlop);
        lizz = findViewById(R.id.lizzo);
        card = findViewById(R.id.answer5);
        nick = findViewById(R.id.nicki);

        button(jlo, card);
        button(lizz, card);
        button(card, card);
        button(nick, card);

    }

    public void button(final Button choose, final Button right){
        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCol(choose, right);
            }
        });
    }
    public void setCol(Button chose, Button right){
        right.setBackgroundColor(Color.GREEN);
        if(right != chose){
            chose.setBackgroundColor(Color.RED);
        }

        else{
            score++;
        }
    }
}
