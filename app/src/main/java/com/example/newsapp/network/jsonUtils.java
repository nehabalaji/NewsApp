package com.example.newsapp.network;

import com.example.newsapp.data.News;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class jsonUtils {

    public static News parseJsonData(String json){
        JSONObject jsonObject;
        News news = new News();
        try {
            jsonObject = new JSONObject(json);
            JSONArray results = jsonObject.getJSONArray("results");
            List<String> title = new ArrayList<>();
            List<String> summary = new ArrayList<>();
            for(int i=0; i<results.length(); i++){
                JSONObject object = results.getJSONObject(i);
                String s = object.getString("title");
                title.add(s);
                String d = object.getString("abstract");
                summary.add(d);

                JSONArray media = object.getJSONArray("media");
                List<String> imageUrl = new ArrayList<>();
                for(int j=0; j<media.length(); j++){
                    JSONObject object1 = media.getJSONObject(j);
                    JSONArray metaData = object1.getJSONArray("media-metadata");
                    for(int k=0; k<1; k++){
                        JSONObject object2 = metaData.getJSONObject(k);
                        String a = object2.getString("url");
                        imageUrl.add(a);
                    }
                }
            }

            news.setHeadlines(title.get(0));





        } catch (JSONException e) {
            e.printStackTrace();
        }

        return news;
    }
}
