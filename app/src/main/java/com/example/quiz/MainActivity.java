package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView rightAnswer = (TextView)findViewById(R.id.flashcard_answer);
                rightAnswer.setTextColor(getResources().getColor(R.color.green));
                findViewById(R.id.flashcard_question).setBackgroundColor(getResources().getColor(R.color.green));

            }
        });

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_answer2).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_answer3).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.flashcard_answer2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               TextView wrongAnswer = (TextView)findViewById(R.id.flashcard_answer2);
               wrongAnswer.setTextColor(getResources().getColor(R.color.red));
            }
        });

        findViewById(R.id.flashcard_answer3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView wrongAnswer2 = (TextView)findViewById(R.id.flashcard_answer3);
                wrongAnswer2.setTextColor(getResources().getColor(R.color.red));

            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddCardActivity.class);
                startActivityForResult(intent,100);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100) {
            String string1 = data.getExtras().getString("string1");
            String string2 = data.getExtras().getString("string2");
            TextView newQuestion = (TextView)findViewById(R.id.flashcard_question);
            newQuestion.setText(string1);
            TextView newAnswer = (TextView)findViewById(R.id.flashcard_answer);
            newAnswer.setText(string2);
        }
    }

        }