package com.zexi.wiki.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

//@RestController return a string; @Controller: return a page
@RestController

public class TestController {
    //GET POST PUT DELETE
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post" + name;
    }
}