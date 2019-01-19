package com.example.handimaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

        //remove
        DataService dataService = new DynamoDBService();
        System.out.println(dataService.SelectUser(1));
    }
}
