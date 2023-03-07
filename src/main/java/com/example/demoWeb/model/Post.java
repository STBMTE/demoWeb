package com.example.demoWeb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;

    private Date creationDate;

    public Post(String text, Integer like, Date creationDate){
        this.text = text;
        this.likes = like;
        this.creationDate = creationDate;
    }

    public Integer getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    public Date getCreationDate(){
        return creationDate;
    }
}
