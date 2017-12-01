package com.example.ted1g.randomnum;

import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.logging.Handler;

/**
 * Created by ted1g on 11/16/2017.
 */

public class RandomRun implements Runnable {

    private final long delayTime = 25;

    TextView randomNumber;
    Handler handler;

    @Override
    public void run(){
        Random rand = new Random();
        //sets the random number between 1 and 20
        int number =  rand.nextInt(100) + 1;
        //this turns the number into a string value to be sent through the intent
        String myString = String.valueOf(number);

     randomNumber.setText(number);

     number ++;
    }

}
