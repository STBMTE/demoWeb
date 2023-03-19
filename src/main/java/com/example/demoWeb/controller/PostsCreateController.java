package com.example.demoWeb.controller;

import com.example.demoWeb.model.Post;
import com.example.demoWeb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class PostsCreateController {
    @Autowired
    PostService postsService;
    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String create() {
        return "create";
    }
    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text) {
        postsService.create(text);
        return "redirect:/";
    }
}
