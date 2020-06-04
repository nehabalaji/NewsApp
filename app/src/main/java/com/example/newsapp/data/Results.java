package com.example.newsapp.data;

import com.google.gson.annotations.SerializedName;

public class Results {

    @SerializedName("title")
    private String title;

    @SerializedName("abstract")
    private String mAbstract;

    @SerializedName("multimedia")
    private Multimedia multimedia;

    public Results(String mTitle, String mabstract, Multimedia mMultimedia){
        this.title = mTitle;
        this.mAbstract = mabstract;
        this.multimedia = mMultimedia;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getmAbstract() {
        return mAbstract;
    }

    public void setmAbstract(String mAbstract) {
        this.mAbstract = mAbstract;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }
}
