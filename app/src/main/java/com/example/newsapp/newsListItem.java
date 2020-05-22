package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.newsapp.data.News;

public class newsListItem extends AppCompatActivity {

    TextView Headline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_list_item);

        Headline = findViewById(R.id.headline);
        News news = new News();
        String headline = news.getHeadlines();

        Headline.setText(headline);



    }
}
