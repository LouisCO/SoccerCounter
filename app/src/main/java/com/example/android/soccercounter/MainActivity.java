package com.example.android.soccercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Tracks the score for Home team
    int scoreHome = 0;
    //Tracks the no. of fouls for Home team
    int foulsHome = 0;
    //Tracks the no. of corners for Home team
    int cornersHome = 0;
    //Tracks the no. of offsides for Home team
    int offsidesHome = 0;
    //Tracks the score for Away team
    int scoreAway = 0;
    //Tracks the no. of fouls for Away team.
    int foulsAway = 0;
    //Tracks the no. of corners for Away team.
    int cornersAway = 0;
    //Tracks the no. of offsides for Away team.
    int offsidesAway = 0;
    //Strings for retrieving counters after rotation
    String nScoreHome = "scoreHome";
    String nFoulsHome = "foulsHome";
    String nCornersHome = "cornersHome";
    String nOffsidesHome = "offsidesHome";
    String nScoreAway = "scoreAway";
    String nFoulsAway = "foulsAway";
    String nCornersAway = "cornersAway";
    String nOffsidesAway = "offsidesAway";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(nScoreHome, scoreHome);
        savedInstanceState.putInt(nFoulsHome, foulsHome);
        savedInstanceState.putInt(nCornersHome, cornersHome);
        savedInstanceState.putInt(nOffsidesHome, offsidesHome);
        savedInstanceState.putInt(nScoreAway, scoreAway);
        savedInstanceState.putInt(nFoulsAway, foulsAway);
        savedInstanceState.putInt(nCornersAway, cornersAway);
        savedInstanceState.putInt(nOffsidesAway, offsidesAway);

        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreHome = savedInstanceState.getInt(nScoreHome);
        foulsHome = savedInstanceState.getInt(nFoulsHome);
        cornersHome = savedInstanceState.getInt(nCornersHome);
        offsidesHome = savedInstanceState.getInt(nOffsidesHome);
        scoreAway = savedInstanceState.getInt(nScoreAway);
        foulsAway = savedInstanceState.getInt(nFoulsAway);
        cornersAway = savedInstanceState.getInt(nCornersAway);
        offsidesAway = savedInstanceState.getInt(nOffsidesAway);
        displayScoreForHome(scoreHome);
        displayFoulsForHome(foulsHome);
        displayCornersForHome(cornersHome);
        displayOffsidesForHome(offsidesHome);
        displayScoreForAway(scoreAway);
        displayFoulsForAway(foulsAway);
        displayCornersForAway(cornersAway);
        displayOffsidesForAway(offsidesAway);
    }

    /**
     * Increases the score for Home team by 1 point.
     */
    public void addGoalForHome(View v) {
        scoreHome = scoreHome + 1;
        displayScoreForHome(scoreHome);
    }

    /**
     * Increases the no. of fouls for Home team by 1.
     */
    public void addFoulForHome(View v) {
        foulsHome = foulsHome + 1;
        displayFoulsForHome(foulsHome);
    }

    /**
     * Increases the no. of corners for Home team by 1
     */
    public void addCornerForHome(View v) {
        cornersHome = cornersHome + 1;
        displayCornersForHome(cornersHome);
    }

    /**
     * Increases the no. of offsides for Home team by 1
     */
    public void addOffsideForHome(View v) {
        offsidesHome = offsidesHome + 1;
        displayOffsidesForHome(offsidesHome);
    }

    /**
     * Increases the score for Away team by 1 point.
     */
    public void addGoalForAway(View v) {
        scoreAway = scoreAway + 1;
        displayScoreForAway(scoreAway);
    }

    /**
     * Increases the no. fouls for Away team by 1.
     */
    public void addFoulForAway(View v) {
        foulsAway = foulsAway + 1;
        displayFoulsForAway(foulsAway);
    }

    /**
     * Increases the no. of corners for Away team by 1.
     */
    public void addCornerForAway(View v) {
        cornersAway = cornersAway + 1;
        displayCornersForAway(cornersAway);
    }

    /**
     * Increases the no. of offsides for Away team by 1.
     */
    public void addOffsideForAway(View v) {
        offsidesAway = offsidesAway + 1;
        displayOffsidesForAway(offsidesAway);
    }

    /**
     * Resets the counters to 0.
     */
    public void resetCounters(View v) {
        scoreHome = 0;
        foulsHome = 0;
        cornersHome = 0;
        offsidesHome = 0;
        scoreAway = 0;
        foulsAway = 0;
        cornersAway = 0;
        offsidesHome = 0;
        offsidesAway = 0;
        displayScoreForHome(scoreHome);
        displayFoulsForHome(foulsHome);
        displayCornersForHome(cornersHome);
        displayOffsidesForHome(offsidesHome);
        displayScoreForAway(scoreAway);
        displayFoulsForAway(foulsAway);
        displayCornersForAway(cornersAway);
        displayOffsidesForAway(offsidesAway);
    }

    /**
     * Displays the score for Home team.
     */
    public void displayScoreForHome(int score) {
        TextView scoreView = findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the no. of fouls for Home team.
     */
    public void displayFoulsForHome(int score) {
        TextView scoreView = findViewById(R.id.home_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays no. of corners for Home team.
     */
    public void displayCornersForHome(int score) {
        TextView scoreView = findViewById(R.id.home_corners);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays no. of offsides for Home team.
     */
    public void displayOffsidesForHome(int score) {
        TextView scoreView = findViewById(R.id.home_offsides);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the score for Away team.
     */
    public void displayScoreForAway(int score) {
        TextView scoreView = findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the no. of fouls for Away team.
     */
    public void displayFoulsForAway(int score) {
        TextView scoreView = findViewById(R.id.away_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays no. of corners for Away team.
     */
    public void displayCornersForAway(int score) {
        TextView scoreView = findViewById(R.id.away_corners);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays no. of offsides for Away team.
     */
    public void displayOffsidesForAway(int score) {
        TextView scoreView = findViewById(R.id.away_offsides);
        scoreView.setText(String.valueOf(score));
    }


}
