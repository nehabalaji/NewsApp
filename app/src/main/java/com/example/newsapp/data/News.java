package com.example.newsapp.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.net.URL;

@Entity (tableName = "News")
public class News {
    @PrimaryKey (autoGenerate = true)
    private int id;

    @ColumnInfo (name = "ImageUrl")
    private String imageUrl;

    @ColumnInfo (name = "Headlines")
    private String headlines;

    @ColumnInfo (name = "Summary")
    private String summary;

    public News(){

    }

    public News(String mImageUrl, String mHeadlines, String mSummary){
        this.imageUrl = mImageUrl;
        this.headlines = mHeadlines;
        this.summary = mSummary;
    }

    @Ignore
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
