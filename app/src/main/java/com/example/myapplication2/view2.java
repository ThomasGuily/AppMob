package com.example.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class view2 extends AppCompatActivity {

    Intent  MyIntent ;
    EditText Et1;
    EditText Et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view2);
        MyIntent = getIntent();
        Et1 = findViewById(R.id.inpu1);
        Et2 = findViewById(R.id.inpu2);

    }

    public void cliqueBouton(View view) {



        String a = Et1.getText().toString();  //je convertis en String


        String b = Et2.getText().toString();


        MyIntent.putExtra("EXTRA2", a + b);


        setResult(Activity.RESULT_OK, MyIntent);
        finish();
    }
}
