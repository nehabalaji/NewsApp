package com.example.newsapp.data;

import com.google.gson.annotations.SerializedName;

public class Multimedia {

    @SerializedName("url")
    private String imageUrl;

    public Multimedia(String mImageUrl){
        this.imageUrl = mImageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
