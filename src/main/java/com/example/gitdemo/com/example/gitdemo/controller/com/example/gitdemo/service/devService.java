package com.example.gitdemo.com.example.gitdemo.controller.com.example.gitdemo.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class devService {
    @RequestMapping
    public String m(){
        return "success";
    }
}
