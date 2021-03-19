package com.example.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginscreen.R;

public class InstructorProfile extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        button = findViewById(R.id.nexttocard);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCardLayoutActivity();

            }

        });
    }

    public void openCardLayoutActivity() {
        Intent intent = new Intent(this, CardLayout.class);
        startActivity(intent);


    }
}
