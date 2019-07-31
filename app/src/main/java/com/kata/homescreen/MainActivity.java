package com.kata.homescreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_NAME = "Name";
    private EditText edtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edt_name);
        Button btnSubmit = findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new SubmitButtonClickListener());

    }

    private class SubmitButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String name = edtName.getText().toString();
            Toast.makeText(MainActivity.this, "Hi "+ name, Toast.LENGTH_LONG).show();

            showGreetingsScreen(name);
        }
    }

    private void showGreetingsScreen(String name) {
        Intent intent = new Intent(MainActivity.this, OnboardingActivity.class);
        intent.putExtra(KEY_NAME, name);
        startActivity(intent);
    }
}
