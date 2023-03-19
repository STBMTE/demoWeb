package com.example.demoWeb.service;

import com.example.demoWeb.model.Post;
import com.example.demoWeb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesService {
    @Autowired
    PostRepository postRepository;
    public Integer like(Long postId){
        Post post = postRepository.findById(postId).get();
        post.setLikes(post.getLikes() + 1);
        postRepository.save(post);
        return post.getLikes();
    }
}
