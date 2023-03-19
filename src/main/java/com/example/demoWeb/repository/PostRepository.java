package com.example.demoWeb.repository;

import com.example.demoWeb.model.Post;
import org.springframework.data.repository.CrudRepository;
import javax.servlet.http.HttpServlet;

public interface PostRepository extends CrudRepository<Post, Long> {
}