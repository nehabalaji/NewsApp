package com.example.newsapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.example.newsapp.R;
import com.example.newsapp.adapter.RecyclerViewAdapter;
import com.example.newsapp.data.News;
import com.example.newsapp.network.ApiClient;
import com.example.newsapp.network.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    List<News> newsList;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsList = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<List<News>> call = apiService.getNews();
        call.enqueue(new Callback<List<News>>() {
            @Override
            public void onResponse(Call<List<News>> call, Response<List<News>> response) {
                newsList = response.body();
                recyclerViewAdapter.setNewsList(newsList);
            }

            @Override
            public void onFailure(Call<List<News>> call, Throwable t) {
                Log.d("TAG","Response = "+t.toString());
            }
        });

        recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(), newsList);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);
    }
}
