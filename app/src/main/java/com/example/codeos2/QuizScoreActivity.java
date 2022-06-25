package com.example.codeos2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class QuizScoreActivity extends AppCompatActivity {

    TextView textView, ScoreTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_score);

        textView = findViewById(R.id.textView);
        ScoreTV = findViewById(R.id.ScoreTV);

        Intent a = getIntent();

        int score = a.getIntExtra("correct", 0);
        score = score * 2;

        ScoreTV.setText(score + "/20");
    }
}