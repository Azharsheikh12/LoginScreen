package com.example.loginscreen.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.loginscreen.BottomNavActivity;
import com.example.loginscreen.DetailActivity;
import com.example.loginscreen.GetStarted;
import com.example.loginscreen.R;
import com.example.loginscreen.VolleyListActivity;
import com.example.loginscreen.model.CourseGridModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class CourseGridAdapter extends RecyclerView.Adapter<CourseGridAdapter.ViewHolder> {


    private ArrayList<CourseGridModel> android;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_android;
        private ImageView img_android;
        private LinearLayout ll_main;
        public ViewHolder(View view){

            super(view);

            ll_main = view.findViewById(R.id.ll_main);
            tv_android = (TextView)view.findViewById(R.id.tv_android);
            img_android = (ImageView)view.findViewById(R.id.img_android);
        }
    }

    public CourseGridAdapter(Context context, ArrayList<CourseGridModel> android){
        this.android= android;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_gridlayout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.tv_android.setText(android.get(i).getAndroid_version_name());
        Picasso.with(context).load(android.get(i).getAndroid_image_url()).resize(240, 120).into(viewHolder.img_android);
        //Picasso.with(context).load(android.get(i).getAndroid_image_url()).into(viewHolder.img_android);
        // Glide.with(context).load(android.get(i).getAndroid_image_url()).into(viewHolder.img_android);



        viewHolder.ll_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detail = new Intent(context, BottomNavActivity.class);
                detail.putExtra("name",android.get(i).getAndroid_version_name());
                detail.putExtra("image",android.get(i).getAndroid_image_url());
                detail.setFlags(FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(detail);
                Toast.makeText(context, "hello how arev you?", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return android.size();
    }



}

