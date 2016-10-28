package com.example.admin.aaaaaaaaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;


public class maths extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    RadioGroup q1, q2, q3,q4,q5;
    int score =0;
    TextView results;
    Button show, menus;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maths);

        results = (TextView) findViewById(R.id.tv_result);
        show = (Button) findViewById(R.id.show);
        menus = (Button) findViewById(R.id.menu);
        q1=(RadioGroup) findViewById(R.id.q1);
        q1.setOnCheckedChangeListener(this);
        q2=(RadioGroup) findViewById(R.id.q2);
        q2.setOnCheckedChangeListener(this);
        q3=(RadioGroup) findViewById(R.id.q3);
        q3.setOnCheckedChangeListener(this);
        q4=(RadioGroup) findViewById(R.id.q4);
        q4.setOnCheckedChangeListener(this);
        q5=(RadioGroup) findViewById(R.id.q5);
        q5.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.question1_option_e:
                score++;
                break;

            case R.id.question2_option_b:
                score++;
                break;

            case R.id.question3_option_e:
                score++;
                break;

            case R.id.question4_option_a:
                score++;
                break;

            case R.id.question5_option_c:
                score++;
                break;
        }
    }

    public void goToMenu(View v) {
        Intent in = new Intent(maths.this, quizz_menu.class);
        startActivity(in);
    }
    public void showResults(View v) {
        results.setVisibility(View.VISIBLE);
        results.setText(""+score);
    }
}
