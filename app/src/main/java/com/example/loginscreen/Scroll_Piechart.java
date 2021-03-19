package com.example.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginscreen.adapter.MoviesAdapter;
import com.example.loginscreen.model.MovieModel;

import java.util.ArrayList;
import java.util.List;
public class Scroll_Piechart extends AppCompatActivity {
    private List<MovieModel> companylist = new ArrayList<>();
    private MoviesAdapter mAdapter;
    private Button button;

    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piechart);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        mAdapter = new MoviesAdapter(companylist);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }
    private void prepareMovieData() {
        MovieModel movie = new MovieModel("Google");
        companylist.add(movie);
        movie = new MovieModel("Accenture");
        companylist.add(movie);
        movie = new MovieModel("Hawlett ");
        companylist.add(movie);
        movie = new MovieModel("TCS iON");
        companylist.add(movie);
        movie = new MovieModel("Space X");
        companylist.add(movie);
        movie = new MovieModel("Tesla");
        companylist.add(movie);
        movie = new MovieModel("Yahoo");
        companylist.add(movie);
        movie = new MovieModel("Microsoft");

        mAdapter.notifyDataSetChanged();


        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

        button = findViewById(R.id.btn_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfileActivity();

            }

        });
    }

    public void openProfileActivity() {
        Intent intent = new Intent(this,InstructorProfile.class);
        startActivity(intent);


    }
}




