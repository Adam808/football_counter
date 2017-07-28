package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreHome = 0;
    int scoreAway = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForHome(View v) {
        scoreHome += 1;
        displayForHome(scoreHome);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForHome(View v) {
        scoreHome += 2;
        displayForHome(scoreHome);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForHome(View v) {
        scoreHome += 3;
        displayForHome(scoreHome);
    }

    /**
     * Increase the score for Team A by 6 points.
     */
    public void addSixForHome(View v) {
        scoreHome += 6;
        displayForHome(scoreHome);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForAway(View v) {
        scoreAway += 1;
        displayForAway(scoreAway);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForAway(View v) {
        scoreAway += 2;
        displayForAway(scoreAway);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForAway(View v) {
        scoreAway += 3;
        displayForAway(scoreAway);
    }

    /**
     * Increase the score for Team B by 6 points.
     */
    public void addSixForAway(View v) {
        scoreAway += 6;
        displayForAway(scoreAway);
    }

    public void reset(View v) {
        scoreHome = 0;
        scoreAway = 0;
        displayForHome(scoreHome);
        displayForAway(scoreAway);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForAway(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }
}