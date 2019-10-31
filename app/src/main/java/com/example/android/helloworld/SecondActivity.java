package com.example.android.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity{

    MainActivity mainActivity = new MainActivity();
    TextView hello;
    EditText name;
    String person;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setText();
    }


    public void setText () {
        intent = getIntent();
        name = (EditText) findViewById(R.id.name);
        hello = (TextView) findViewById(R.id.hello);
        person = intent.getStringExtra("name");
        Log.e("SecondActivity","Creature name = "+ person);

        //Toast.makeText(getApplicationContext(), person, Toast.LENGTH_LONG).show();

        //person = mainActivity.getCreature();

        hello.setText("Hello " + person + "!");

    }
}
