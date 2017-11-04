package com.example.ted1g.theguesinggameassignment2;

/**
 * Created by Ted Ginn
 * 11/1/2017
 * This activity checks the number inputted and counts the clicks
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GuessingActivity extends AppCompatActivity
{
    Button buttonCheck;
    TextView enterNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guessing);
        final Button buttonCheck = (Button)findViewById(R.id.buttonCheck);

        buttonCheck.setOnClickListener(new View.OnClickListener()
        {
            Random rand = new Random();
            //sets the random number between 1 and 20
            int number =  rand.nextInt(20) + 1;
            int clickCount = 0;
            //this turns the number into a string value to be sent through the intent
            String myString = String.valueOf(number);

            @Override
            public void onClick(View view)
            {
               EditText enterNumberEditText = (EditText) findViewById(R.id.enterNumber);
               int enterNumber = Integer.parseInt(enterNumberEditText.getText().toString());
                //Toast.makeText(GuessingActivity.this, "This is the number " + myString, Toast.LENGTH_SHORT).show();
                //this increments one each time the button is clicked
                clickCount++;
                String message;


                if (enterNumber == number)
                {
                    Toast.makeText(GuessingActivity.this, "Congratulations! You guessed the correct number", Toast.LENGTH_SHORT).show();
                    //clickCount = clickcount + 1;
                    //Toast.makeText(GuessingActivity.this, "This is how many clicks it took " + clickCount, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(GuessingActivity.this, ResultsActivity.class);
                    intent.putExtra("clicks", clickCount);
                    startActivity(intent);
                }
                else if (enterNumber > number)
                {
                    Toast.makeText(GuessingActivity.this, "To high, please pick a number that is smaller", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(GuessingActivity.this, "To low, please pick a higher number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
