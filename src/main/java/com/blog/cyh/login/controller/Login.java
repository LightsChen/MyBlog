package com.blog.cyh.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class Login {
    @GetMapping("/do")
    public String getActorName(){
        return "Start Spring boot！111";
    }
}
