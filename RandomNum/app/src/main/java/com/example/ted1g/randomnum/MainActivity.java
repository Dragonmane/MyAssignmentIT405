package com.example.ted1g.randomnum;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button buttonCheck;
    TextView RandomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCheck = findViewById(R.id.stopRest);

        Handler handler = new Handler();

        buttonCheck.setOnClickListener(new View.OnClickListener());


       /*@Override
        public void onClick (View view)
        {
            TextView newNumber = (TextView) findViewById(R.id.RandomNumber);
            int numberRand = Integer.parseInt(myString);
            //Toast.makeText(GuessingActivity.this, "This is the number " + myString, Toast.LENGTH_SHORT).show();
            //this increments one each time the button is clicked
            clickCount++;
            String message;
        }*/
    }
}