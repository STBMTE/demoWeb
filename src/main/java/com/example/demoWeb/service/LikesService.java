package com.example.demoWeb.service;

import com.example.demoWeb.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class LikesService {
    @Autowired
    private PostService postService;

    public int like(Long id){
        Post post = postService.listAllPosts().get(id.intValue());
        post.setLikes(post.getLikes() + 1);
        return post.getLikes();
    }
}
