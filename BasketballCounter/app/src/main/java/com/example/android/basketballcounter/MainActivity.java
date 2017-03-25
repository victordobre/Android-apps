package com.example.android.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button threePointsA;
    private Button twoPointsA;
    private Button freeThrowA;
    private Button threePointsB;
    private Button twoPointsB;
    private Button freeThrowB;
    private Button resetScore;
    private TextView scoreTextViewA;
    private TextView scoreTextViewB;
    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        threePointsA = (Button) findViewById(R.id.threePointsButtonA);
        twoPointsA = (Button) findViewById(R.id.twoPointsButtonA);
        freeThrowA = (Button) findViewById(R.id.freeThrowButtonA);
        threePointsB = (Button) findViewById(R.id.threePointsButtonB);
        twoPointsB = (Button) findViewById(R.id.twoPointsButtonB);
        freeThrowB = (Button) findViewById(R.id.freeThrowButtonB);
        resetScore = (Button) findViewById(R.id.resetScore);
        scoreTextViewA = (TextView) findViewById(R.id.team_a_score);
        addListeners();
        scoreTextViewB = (TextView) findViewById(R.id.team_b_score);
        addListeners();
    }

    /**
     * Displays the given score for Team A and B
     */
    public void displayForTeamA(int scoreA) {
        scoreTextViewA.setText(String.valueOf(scoreA));
    }

    public void displayForTeamB(int scoreB) {
        scoreTextViewB.setText(String.valueOf(scoreB));
    }


    private void addListeners() {

        /**
         * Resets the score for Team A and Team B back to 0
         */
        resetScore.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
            scoreA = 0;
            scoreB = 0;
            displayForTeamA(scoreA);
            displayForTeamB(scoreB);
        }
            });


        threePointsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTextViewA.setText(String.valueOf(scoreA + 3));
                scoreA += 3;
            }
        });

        twoPointsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTextViewA.setText(String.valueOf(scoreA + 2));
                scoreA += 2;
            }
        });

        freeThrowA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTextViewA.setText(String.valueOf(scoreA + 1));
                scoreA += 1;
            }
        });
        threePointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTextViewB.setText(String.valueOf(scoreB + 3));
                scoreB += 3;
            }
        });

        twoPointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTextViewB.setText(String.valueOf(scoreB + 2));
                scoreB += 2;
            }
        });

        freeThrowB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTextViewB.setText(String.valueOf(scoreB + 1));
                scoreB += 1;

            }


        });

    }

}