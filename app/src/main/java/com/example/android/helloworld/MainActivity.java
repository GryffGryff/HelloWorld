package com.example.android.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button sayHi;
    EditText name;
    String creature = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setClickListener();
    }

    public void setClickListener() {
        sayHi = (Button) findViewById(R.id.sayHi);
        name = (EditText) findViewById(R.id.name);
        //setCName(creature);

        sayHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCreature();
                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                myIntent.putExtra("name", getCreature());
                MainActivity.this.startActivity(myIntent);

                //Toast.makeText(getApplicationContext(), "Hello World!", Toast.LENGTH_LONG).show();

            }
        });
    }

    public void setCreature() {
        this.creature = name.getText().toString();
        //Toast.makeText(getApplicationContext(), cName, Toast.LENGTH_LONG).show();
        Log.e("MainActivity","Creature name = "+ creature);
    }

    public String getCreature() {
        return creature;
    }
}
