package com.example.ted1g.theguesinggameassignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Bundle extras = getIntent().getExtras();

        TextView showClicks = (TextView)findViewById(R.id.number_guess);
        showClicks.setText(extras.getInt(showClicks, clickCount));
    }

    public void startOver(View view)
    {
        Intent intent = new Intent(getApplicationContext(), LandingActivity.class);
        startActivity(intent);
    }
}
