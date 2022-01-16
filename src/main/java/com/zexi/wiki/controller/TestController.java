package com.zexi.wiki.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController return a string; @Controller: return a page
@RestController

public class TestController {
    @Value("${test.hello:TEST}")
    private String testHello;
    //GET POST PUT DELETE
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World" + testHello;
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post" + name;
    }
}