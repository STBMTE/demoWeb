package com.example.demoWeb.service;

import com.example.demoWeb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> ListPosts = new ArrayList<Post>();

    public PostService(){
        Date creationDate = new Date();
        ListPosts.add(new Post(0L, "Post 1", 72, creationDate));
        ListPosts.add(new Post(1L, "Post 2", 52, creationDate));
        ListPosts.add(new Post(2L, "Post 3", 2, creationDate));
    }
    public List<Post> listAllPosts(){
        return ListPosts;
    }

    public void create(String text) {
        ListPosts.add(new Post(ListPosts.size() + 1L, text,0, new Date()));
    }
}
