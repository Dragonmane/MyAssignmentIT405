package co.miniforge.corey.mediatracker;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

import co.miniforge.corey.mediatracker.media_recycler.MediaViewHolder;
import co.miniforge.corey.mediatracker.model.MediaItem;

import static co.miniforge.corey.mediatracker.MyListActivity.mediaExtra;

public class MediaDetailActivity extends AppCompatActivity {

    MediaItem mediaItem;

    Button saveButton;
    EditText urlText;
    EditText description;
    EditText titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_detail);

        Intent intent = getIntent();

        if(intent.hasExtra(mediaExtra)){
            String extra = intent.getStringExtra(mediaExtra);

            try {
                mediaItem = new MediaItem(new JSONObject(extra));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        //Get the intent data from the intent (your mediaItem object)
        // 1) Check if intent has extra MyListActivity.mediaExtra

        // 2) Get the string extra from the intent
        // 3) mediaItem = new MediaItem(new JSONObject(string extra));

        urlText = (EditText) findViewById(R.id.urlText);
        description = (EditText) findViewById(R.id.descriptionText);
        titleText = (EditText) findViewById(R.id.titleText);

        saveButton = (Button) findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Update media item with values from edit texts
                mediaItem.title = titleText.getText().toString();
                mediaItem.description = description.getText().toString();
                mediaItem.url = urlText.getText().toString();

                //Create intent and put string extra with media item
                Intent intent = new Intent(getApplicationContext(), MyListActivity.class);

                intent.putExtra(mediaExtra, mediaItem.toJson().toString());

                startActivity(intent);
            }
        });
    }
}
