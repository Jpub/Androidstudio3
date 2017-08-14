package com.ebookfrenzy.buildexample;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BuildExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_example);

        ConstraintLayout myLayout =
                (ConstraintLayout) findViewById(R.id.activity_build_example);
        myLayout.setBackgroundColor(Color.GREEN);
    }
}
