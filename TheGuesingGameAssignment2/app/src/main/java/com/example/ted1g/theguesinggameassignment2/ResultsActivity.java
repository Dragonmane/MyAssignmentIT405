package com.example.ted1g.theguesinggameassignment2;

/**
 * Created by Ted Ginn
 * 11/1/2017
 * This activity displays the click count and sends the user to the launcher activity
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Bundle extras = getIntent().getExtras();

        //puts the click count in a textview
        TextView showClicks = (TextView)findViewById(R.id.number_guess);
        showClicks.setText(extras.getInt("clicks", 0) + "");
    }

    public void startOver(View view)
    {
        //This sends the user to the landing activity
        Intent intent = new Intent(getApplicationContext(), LandingActivity.class);
        startActivity(intent);
    }
}
