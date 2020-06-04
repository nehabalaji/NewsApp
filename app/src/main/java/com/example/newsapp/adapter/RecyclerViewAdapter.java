package com.example.newsapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.newsapp.R;
import com.example.newsapp.data.News;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    Context context;
    List<News> newsList;

    public RecyclerViewAdapter(Context mContext, List<News> mNewsList){
        this.context = mContext;
        this.newsList = mNewsList;
    }

    public void setNewsList(List<News> mNewsList){
        this.newsList = mNewsList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_news_list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(newsList.get(position).getResults().getTitle());
        holder.summary.setText(newsList.get(position).getResults().getmAbstract());
        Glide.with(context).load(newsList.get(position).getResults().getMultimedia().getImageUrl()).apply(RequestOptions.centerCropTransform()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        if(newsList!=null){
            return newsList.size();
        }
        else {
            return 0;
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title, summary;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            summary = itemView.findViewById(R.id.summary);
            imageView = itemView.findViewById(R.id.img);
        }
    }
}
