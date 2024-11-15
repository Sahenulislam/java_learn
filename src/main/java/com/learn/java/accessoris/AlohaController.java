package com.learn.java.accessoris;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class AlohaController {


    @GetMapping("/hello")
    public String getHelloWorld() {
        return "hello world";
    }

}
