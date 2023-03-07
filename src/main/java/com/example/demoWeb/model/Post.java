package com.example.demoWeb.model;

public class Post {
    private String text;
    private Integer likes;

    public Post(String text, Integer like){
        this.text = text;
        likes = like;
    }

    public Integer getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }
}
