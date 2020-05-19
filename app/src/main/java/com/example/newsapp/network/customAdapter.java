package com.example.newsapp.network;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.R;
import com.example.newsapp.data.News;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import java.util.List;

public class customAdapter extends RecyclerView.Adapter<customAdapter.CustomViewHolder> {

    private List<News> newsList;
    private Context context;

    public customAdapter(Context mContext, List<News> mNewsList){
        this.context = mContext;
        this.newsList = mNewsList;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_news_list_item, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.headline.setText(newsList.get(position).getHeadlines());
        holder.summary.setText(newsList.get(position).getSummary());

        

        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttpDownloader(context));
        builder.build().load(newsList.get(position).getImageUrl())
                .placeholder((R.drawable.ic_launcher_background))
                .error(R.drawable.ic_launcher_background)
                .into(holder.image);
    }


    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder{

        public final View mView;
        TextView headline, summary;
        ImageView image;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;

            headline = mView.findViewById(R.id.headline);
            summary = mView.findViewById(R.id.summary);
            image = mView.findViewById(R.id.img);

        }
    }
}
