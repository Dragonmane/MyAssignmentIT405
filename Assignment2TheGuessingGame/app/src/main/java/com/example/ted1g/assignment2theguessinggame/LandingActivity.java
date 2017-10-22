package com.example.ted1g.assignment2theguessinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.id.input;

public class LandingActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

    }


    public void onStartGameClick(View view)
    {
        Intent intent = new Intent(getApplicationContext(), GuessingActivity.class);
        startActivity(intent);
    }
}
