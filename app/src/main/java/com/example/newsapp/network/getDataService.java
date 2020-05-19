package com.example.newsapp.network;

import com.example.newsapp.data.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface getDataService {

    @GET("/mostpopular/v2/viewed/1.json?api-key=kJjegnNI2NldBOsCzEmyaiNqBaXhyk18")
    Call<List<News>> getNews();

}
