package com.example.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginscreen.adapter.CourseAdapter;
import com.example.loginscreen.model.CourseModel;

import java.util.ArrayList;

public class CardLayout extends AppCompatActivity {

    private RecyclerView courseRV;
    private ArrayList<CourseModel> courseModelArrayList;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardlayout_main);
        courseRV = findViewById(R.id.idRVCourse);

        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new CourseModel("Python", 4, R.drawable.ai));
        courseModelArrayList.add(new CourseModel("Data Engineering", 3, R.drawable.cc));
        courseModelArrayList.add(new CourseModel("Machine learning", 4, R.drawable.pc));
        courseModelArrayList.add(new CourseModel("Data Science", 4, R.drawable.ml));
        courseModelArrayList.add(new CourseModel("CRM Developement", 4, R.drawable.py));
        courseModelArrayList.add(new CourseModel("Mobile Application", 4, R.drawable.ai));

        CourseAdapter courseAdapter = new CourseAdapter(this, courseModelArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);

        button = findViewById(R.id.nexttoGrid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGridActivity();

            }

        });
    }

    public void openGridActivity() {
        Intent intent = new Intent(this,CourseGridActivity.class);
        startActivity(intent);


    }
}



