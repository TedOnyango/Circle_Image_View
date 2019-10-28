package com.ted.circleimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CircleImageView circleImageView = (CircleImageView) findViewById(R.id.profile_image);
        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityTwoIntent(circleImageView);
            }
        });

    }

    public void activityTwoIntent(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
