package com.example.demoWeb.service;

import com.example.demoWeb.model.Post;
import com.example.demoWeb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }
    public void create(String text) {
        Post post = new Post(new Date(),postRepository.count()+1,text,0);
        postRepository.save(post);
    }
}
