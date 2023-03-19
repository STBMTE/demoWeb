package com.example.demoWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes;
    private String creationDate;

    public Post(Date _creationDate, Long _id, String _text, Integer _likes) {
        this.creationDate = _creationDate.toString();
        this.id = _id;
        this.text = _text;
        this.likes = _likes;
    }

    public Post() {

    }

    public Long getId() {
        return id;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    public String getCreationDate() { return creationDate; }
}
