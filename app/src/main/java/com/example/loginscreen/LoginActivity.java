package com.example.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_scrn);
        textView = (TextView)findViewById(R.id.txt1);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        //textView.setText(str);
        textView.setText("Welcome " +(str));

        button = findViewById(R.id.GetStarted);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCircleActivity();

            }

        });
    }

    public void openCircleActivity() {
        Intent intent = new Intent(this, Circle.class);
        startActivity(intent);


    }
}




