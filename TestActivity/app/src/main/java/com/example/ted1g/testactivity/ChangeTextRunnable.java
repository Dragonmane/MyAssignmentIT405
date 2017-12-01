package com.example.ted1g.testactivity;

import android.widget.TextView;

/**
 * Created by ted1g on 11/16/2017.
 */

public class ChangeTextRunnable implements Runnable {

    TextView message;
    String userInput;

    public ChangeTextRunnable(TextView message){
        this(message, "");
    }

    public ChangeTextRunnable(TextView message, String newText){
        this.message = message;
        this.userInput = newText;
    }
    @Override
    public void run(){
        if (message == null){
            return;

        }
        message.setText(userInput);
    }
}
