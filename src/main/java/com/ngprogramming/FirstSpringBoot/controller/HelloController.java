package com.ngprogramming.FirstSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {


//    localhost:8080/api/v1/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!!";
    }

    @GetMapping("/")
    public String index() {
        return "<h1>Hello World!asd</h1>";
    }

    @GetMapping("/bilal")
    public String about() {
        return "<h1>About  Section</h1>";
    }

    @PostMapping("/contact")
    public String contact() {
        return "<h1>Contact Section</h1>";
    }

}
