package com.example.demoWeb.model;

import java.util.Date;

public class Post {
    private Long id;
    private String text;
    private Integer likes;

    private Date creationDate;

    public Post(Long id, String text, Integer like, Date creationDate){
        this.id = id;
        this.text = text;
        this.likes = like;
        this.creationDate = creationDate;
    }

    public Long getId(){
        return id;
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

    public void setLikes(int i) {
        likes = i;
    }
}
