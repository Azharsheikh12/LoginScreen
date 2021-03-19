package com.example.loginscreen.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.loginscreen.R;
import com.example.loginscreen.model.VolleylistModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class VolleylistAdapter extends RecyclerView.Adapter<VolleylistAdapter.ViewHolder> {
    private List<VolleylistModel>list_data;
    private Context context;

    public VolleylistAdapter(List<VolleylistModel> list_data, Context context) {
        this.list_data = list_data;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.volleylist_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        VolleylistModel listData=list_data.get(position);

        Picasso.with(context)
                .load(listData
                        .getImg())
                .into(holder.img);

        holder.txtname.setText(listData.property_type);

    }

    @Override
    public int getItemCount() {
        return list_data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        private TextView txtname;
        public ViewHolder(View itemView) {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.image_view);
            txtname=(TextView)itemView.findViewById(R.id.text_name);
        }
    }
}