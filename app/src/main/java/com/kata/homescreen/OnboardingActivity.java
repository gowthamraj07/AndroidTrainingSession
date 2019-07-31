package com.kata.homescreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class OnboardingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        String name = getIntent().getStringExtra(MainActivity.KEY_NAME);

        TextView tvGreeting = findViewById(R.id.tv_greeting);
        tvGreeting.setText("Hi "+name);
    }
}
