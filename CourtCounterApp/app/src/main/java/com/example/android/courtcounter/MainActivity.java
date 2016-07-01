package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int homeScoreValue = 0;
    int awayScoreValue = 0;

    public void home1PT(View view){
        TextView homeScore = (TextView) findViewById(R.id.homePoints);
        homeScoreValue = homeScoreValue + 1;
        if (homeScoreValue < 10){
            homeScore.setText("0" + homeScoreValue);
        }
        else {
            homeScore.setText("" + homeScoreValue);
        }
    }

    public void home2PT(View view){
        TextView homeScore = (TextView) findViewById(R.id.homePoints);
        homeScoreValue = homeScoreValue + 2;
        if (homeScoreValue < 10){
            homeScore.setText("0" + homeScoreValue);
        }
        else {
            homeScore.setText("" + homeScoreValue);
        }
    }

    public void home3PT(View view){
        TextView homeScore = (TextView) findViewById(R.id.homePoints);
        homeScoreValue = homeScoreValue + 3;
        if (homeScoreValue < 10){
            homeScore.setText("0" + homeScoreValue);
        }
        else {
            homeScore.setText("" + homeScoreValue);
        }
    }

    public void away1PT(View view){
        TextView awayScore = (TextView) findViewById(R.id.awayPoints);
        awayScoreValue = awayScoreValue + 1;
        if (awayScoreValue < 10){
            awayScore.setText("0" + awayScoreValue);
        }
        else {
            awayScore.setText("" + awayScoreValue);
        }
    }

    public void away2PT(View view){
        TextView awayScore = (TextView) findViewById(R.id.awayPoints);
        awayScoreValue = awayScoreValue + 2;
        if (awayScoreValue < 10){
            awayScore.setText("0" + awayScoreValue);
        }
        else {
            awayScore.setText("" + awayScoreValue);
        }
    }

    public void away3PT(View view){
        TextView awayScore = (TextView) findViewById(R.id.awayPoints);
        awayScoreValue = awayScoreValue + 3;
        if (awayScoreValue < 10){
            awayScore.setText("0" + awayScoreValue);
        }
        else {
            awayScore.setText("" + awayScoreValue);
        }
    }

    public void reset(View view){
        TextView homeScore = (TextView) findViewById(R.id.homePoints);
        homeScoreValue = 0;
        homeScore.setText("0" + homeScoreValue);

        TextView awayScore = (TextView) findViewById(R.id.awayPoints);
        awayScoreValue = 0;
        awayScore.setText("0" + awayScoreValue);
    }
}
