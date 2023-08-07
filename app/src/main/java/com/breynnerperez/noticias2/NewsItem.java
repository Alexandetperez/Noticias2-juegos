package com.breynnerperez.noticias2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
public class NewsItem {
    private String title;
    private String imageUrl;
    private String description;
    private String url;

    public NewsItem(String title, String imageUrl, String description, String url) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}