package com.example.ted1g.assignment2theguessinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.ted1g.assignment2theguessinggame.R.layout.activity_guessing;

public class GuessingActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(activity_guessing);

        final Button checkNumber = (Button) findViewById(R.id.checkNumber);
        Bundle extras = this.getIntent().getExtras();
        int upperLimit = extras.getInt("upperLimit");

        final int randomNumber = (int)(Math.random() * upperLimit + 1);

        checkNumber.setOnClickListener(new View.OnClickListener()
        {
            int clickCount = 0;

            @Override
            public void onClick(View view)
            {
                EditText enterNumberEditText = (EditText)GuessingActivity.this.findViewById(R.id.enterNumber);
                int enterNumber = Integer.parseInt(enterNumberEditText.getText().toString());

                String message;

                if(enterNumber == randomNumber)
                {
                    Toast.makeText(GuessingActivity.this, "Congratulations! You guessed the correct number.", Toast.LENGTH_SHORT).show();
                }
                else if (enterNumber < randomNumber)
                {
                Toast.makeText(GuessingActivity.this, "The number is larger than your choice", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(GuessingActivity.this, "The number is smaller than your choice.", Toast.LENGTH_SHORT).show();
                }

                clickCount = clickCount + 1;


            }
        });

        Intent intent = new Intent(GuessingActivity.this, ResultsActivity.class);
        intent.putExtra("counting clicks", clickCount);
        startActivity(intent);
    }
}







