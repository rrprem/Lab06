package com.premanandrhea.lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    Button start;
    String JSON_string;
    String one, two;
    TextView quest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.but);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStart();
            }
        });

        quest = findViewById(R.id.sentence);
        JSON_string = "{\"question\":{\"one\":\"can you \",\"two\":do it}}";

        try{
            JSONObject obj = new JSONObject(JSON_string);
            JSONObject employee = obj.getJSONObject("question");
            one = employee.getString("one");
            two = employee.getString("two");
            quest.setText(one + two);
        }
        catch (JSONException e){
            e.printStackTrace();
        }
    }

    public void openStart(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}
