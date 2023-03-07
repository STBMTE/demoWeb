package com.example.demoWeb.service;

import com.example.demoWeb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private List<Post> ListPosts = new ArrayList<Post>();

    public PostService(){
        ListPosts.add(new Post("Post 1", 72));
        ListPosts.add(new Post("Post 2", 52));
        ListPosts.add(new Post("Post 3", 2));
    }
    public List<Post> listAllPosts(){
        return ListPosts;
    }
}
