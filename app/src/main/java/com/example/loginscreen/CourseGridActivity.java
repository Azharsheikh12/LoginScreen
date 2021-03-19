package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.loginscreen.adapter.CourseGridAdapter;
import com.example.loginscreen.model.CourseGridModel;

import java.util.ArrayList;

public class CourseGridActivity extends AppCompatActivity {
    Context context;
    private Button button;

    private final String android_versions_name[] = {

            "Data Analyst",
            "Data Engineer",
            "Python Programming",
            "Machine Learning",
            "Data Scientist",
            "Big Data Eng.",
            "Data Mining",
            "Blockchain Tech.",
    };

    private final int android_image_urls[] = {

            R.drawable.imga,
            R.drawable.imgb,
            R.drawable.imgc,
            R.drawable.imgd,
            R.drawable.imge,
            R.drawable.imgf,
            R.drawable.imgd,
            R.drawable.imgb,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout_main);
        initView();

//        button = findViewById(R.id.nexttoGrid);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openNavigationActivity();
//
//            }
//
//        });


    }

    private void initView(){
        context= CourseGridActivity.this;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(context,2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<CourseGridModel> androidVersions = prepareData();
        CourseGridAdapter adapter = new CourseGridAdapter(getApplicationContext(),androidVersions);
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<CourseGridModel> prepareData(){

        ArrayList<CourseGridModel> android_version = new ArrayList<>();
        for(int i=0; i< android_versions_name.length; i++){

            CourseGridModel androidVersion = new CourseGridModel();
            androidVersion.setAndroid_version_name(android_versions_name[i]);
            androidVersion.setAndroid_image_url(android_image_urls[i]);
            android_version.add(androidVersion);
        }
        return android_version;

    }


//    public void openNavigationActivity() {
//        Intent intent = new Intent(this,BottomNavActivity.class);
//        startActivity(intent);
//
//
//    }
}
