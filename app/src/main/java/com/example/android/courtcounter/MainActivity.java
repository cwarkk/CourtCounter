package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void threePoints(View view) {
        int points = 3;
        scoreTeamA += points;
        displayForTeamA(scoreTeamA);
    }

    public void twoPoints(View view) {
        int points = 2;
        scoreTeamA += points;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrow(View view) {
        int points = 1;
        scoreTeamA += points;
        displayForTeamA(scoreTeamA);
    }

    public void threePointsB(View view) {
        int points = 3;
        scoreTeamB += points;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsB(View view) {
        int points = 2;
        scoreTeamB += points;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowB(View view) {
        int points = 1;
        scoreTeamB += points;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}