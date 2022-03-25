package com.example.three;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView result;
    EditText text1;
    EditText text2;
    RadioButton rb1;
    RadioButton rb2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.X);
        text2 = findViewById(R.id.Y);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        result = findViewById(R.id.result);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }


    public void onClick(View v) {
        double x = Double.parseDouble(text1.getText().toString());
        double y = Double.parseDouble(text2.getText().toString());
        double bmi;
        String str = "你的BMI指数是";
        if(x<=0||y<=0) {
            result.setText("错误");
            return;
        }
        bmi = y/(x*x);
        String str1 = String.format("%.2f",bmi);
        str = str + str1;
       if(rb2.isChecked()){
           bmi -= 1;
           str +="体型：";
           if(bmi < 19)
               str += "过轻";
           else if(bmi < 24)
               str +="适中";
           else if(bmi < 29)
               str +="过重";
           else if(bmi < 34)
               str +="肥胖";
           else
               str += "严重肥胖";
           result.setText(str);
       }
    }

}