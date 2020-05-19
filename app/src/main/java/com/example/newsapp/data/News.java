package com.example.newsapp.data;



import com.google.gson.annotations.SerializedName;

import java.net.URL;

public class News {
    @SerializedName("Id")
    private int id;

   @SerializedName("ImageUrl")
    private String imageUrl;

    @SerializedName("Headlines")
    private String headlines;

    @SerializedName("Summary")
    private String summary;

    public News(){

    }

    public News(String mImageUrl, String mHeadlines, String mSummary){
        this.imageUrl = mImageUrl;
        this.headlines = mHeadlines;
        this.summary = mSummary;
    }

    public News(int mId, String mImageUrl, String mHeadlines, String mSummary){
        this.id = mId;
        this.imageUrl = mImageUrl;
        this.headlines = mHeadlines;
        this.summary = mSummary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getHeadlines() {
        return headlines;
    }

    public void setHeadlines(String headlines) {
        this.headlines = headlines;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
