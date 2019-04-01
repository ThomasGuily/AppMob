package com.example.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class view1 extends AppCompatActivity {

    Intent  MyIntent;
    EditText Et1;
    EditText Et2;
    EditText Et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view1);
        MyIntent = getIntent();
        Et1 = findViewById(R.id.inp1);
        Et2 = findViewById(R.id.inp2);
        Et3 = findViewById(R.id.inp3);
        //tv = (TextView) findViewById(R.id.textView4);
    }

    public void cliqueBouton(View view) {




        String a = Et1.getText().toString();  //je convertis en String


        String b = Et2.getText().toString();

        String c = Et3.getText().toString();

        MyIntent.putExtra("EXTRA1", a+b+c );


        setResult(Activity.RESULT_OK, MyIntent);
        finish();


    }
}