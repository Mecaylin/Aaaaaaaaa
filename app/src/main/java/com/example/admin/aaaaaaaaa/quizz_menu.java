package com.example.admin.aaaaaaaaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Admin on 2016-10-17.
 */

public class quizz_menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_menu);
    }

    public void maths (View view){
        Intent maths = new Intent(quizz_menu.this, maths.class);
        startActivity(maths);
    }
}
