package com.example.newsapp.network;

import com.example.newsapp.data.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("topstories/v2/world.json")
    Call<List<News>> getNews(@Query("api-key") String ApiKey);
}
