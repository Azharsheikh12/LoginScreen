package com.example.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Circle extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle);

        button = findViewById(R.id.letsgo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScrollActivity();

            }

        });
    }

    public void openScrollActivity() {
        Intent intent = new Intent(this,Scroll_Piechart.class);
        startActivity(intent);


    }
}


