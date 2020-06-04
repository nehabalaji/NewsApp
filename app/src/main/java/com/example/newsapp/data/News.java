package com.example.newsapp.data;



import com.google.gson.annotations.SerializedName;

import java.net.URL;

public class News {

   @SerializedName("results")
    private Results results;

   public News(Results mResults){
       this.results = mResults;
   }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }
}
