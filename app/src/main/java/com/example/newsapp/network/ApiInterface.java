package com.example.newsapp.network;

import com.example.newsapp.data.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("topstories/v2/world.json?api-key=kJjegnNI2NldBOsCzEmyaiNqBaXhyk18")
    Call<List<News>> getNews();
}
