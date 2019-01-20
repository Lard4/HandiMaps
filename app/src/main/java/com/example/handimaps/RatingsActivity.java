package com.example.handimaps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class RatingsActivity extends AppCompatActivity {

    int difficulty = 0;
    String steepness = "Very Steep";
    boolean hazards = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SeekBar diffSeekBar = (SeekBar) findViewById(R.id.ratings_seekBar1);
        SeekBar steepSeekBar = (SeekBar) findViewById(R.id.ratings_steepness_seekBar);
        Switch hazardSwitch = (Switch) findViewById(R.id.ratings_switch);
        Button submitButton = (Button) findViewById(R.id.ratings_submit);

        // Listener to wait for diffSeekBar changes
        diffSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                // Set difficulty value
                difficulty = i;
                System.out.println("Difficulty is: " + difficulty);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Do nothing
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Do nothing
            }
        });

        // Listener to wait for steepSeekBar changes
        steepSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                // Set steepness
                if(i == 0){
                    steepness = "Flat";
                }else if(i == 1){
                    steepness = "Steep";
                }else if(i == 2){
                    steepness = "Very Steep";
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Do nothing
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Do nothing
            }
        });

        // Listener to wait for hazardSwitch interactions
        hazardSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                // Set hazards to the value of the switch.
                hazards = b;
            }
        });

        // Listener to wait for submitButton interactions
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if the route is already created
                //      average total values with this new one and update the Route
                //else
                //  Apply local variables to API functions to create a new Route
                
                //TODO: Confirm that I am not in charge of creating the polyline JSON.
            }
        });
    }

}
