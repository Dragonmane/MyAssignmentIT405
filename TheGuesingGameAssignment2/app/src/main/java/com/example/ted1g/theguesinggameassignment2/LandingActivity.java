package com.example.ted1g.theguesinggameassignment2;

/**
 * Created by Ted Ginn
 * 11/1/2017
 * This activity starts the guessing game
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    public void onStartClick(View view)
    {
        //sends the user to the guesing activity
        Intent intent = new Intent(getApplicationContext(), GuessingActivity.class);
        startActivity(intent);
    }
}
