package com.example.three;

import static com.example.three.R.layout.activity_main;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BasketballActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView Ascore, Bscore;
    private Button Ap3, Ap2, Ap1;
    private Button Bp3, Bp2, Bp1;
    private Button resetBtn;
    private int Aresult, Bresult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        initView();
    }

    private void initView() {
        Ascore = (TextView) findViewById(R.id.Ascore);
        Bscore = (TextView) findViewById(R.id.Bscore);
        Ap3 = (Button) findViewById(R.id.Ap3);
        Ap2 = (Button) findViewById(R.id.Ap2);
        Ap1 = (Button) findViewById(R.id.Ap1);
        Bp3 = (Button) findViewById(R.id.Bp3);
        Bp2 = (Button) findViewById(R.id.Bp2);
        Bp1 = (Button) findViewById(R.id.Bp1);
        resetBtn = (Button) findViewById(R.id.resetBtn);

        Ap3.setOnClickListener(this);
        Ap2.setOnClickListener(this);
        Ap1.setOnClickListener(this);
        Bp3.setOnClickListener(this);
        Bp2.setOnClickListener(this);
        Bp1.setOnClickListener(this);
        resetBtn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Ap3:
                aAddScore(3);
                break;
            case R.id.Ap2:
                aAddScore(2);
                break;
            case R.id.Ap1:
                aAddScore(1);
                break;
            case R.id.Bp3:
                bAddScore(3);
                break;
            case R.id.Bp2:
                bAddScore(2);
                break;
            case R.id.Bp1:
                bAddScore(1);
                break;
        }
    }

    private void aAddScore(int score) {
        Aresult = Aresult+ score;
        displayAScore(Aresult);
    }
    private void bAddScore(int score) {
        Bresult = Bresult + score;
        displayBScore(Bresult);
    }
    private void resetScore() {
        Aresult = 0;
        Bresult = 0;
        displayAScore(Aresult);
        displayBScore(Bresult);
    }
    private void displayAScore(int score) {
        Ascore.setText(String.valueOf(score));
    }

    private void displayBScore(int score) {
        Bscore.setText(String.valueOf(score));
    }

    }
