package com.ebookfrenzy.multiwindow;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void launchIntent(View view) {
        Intent i = new Intent(this, SecondActivity.class);

        i.addFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT|
                Intent.FLAG_ACTIVITY_MULTIPLE_TASK|
                Intent.FLAG_ACTIVITY_NEW_TASK);

        Rect rect = new Rect(0, 0, 100, 100);
        ActivityOptions options = ActivityOptions.makeBasic();
        ActivityOptions bounds = options.setLaunchBounds(rect);

        startActivity(i, bounds.toBundle());
    }
}
