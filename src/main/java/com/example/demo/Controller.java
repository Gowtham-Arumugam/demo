package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @GetMapping("/home")
    public String sayhi() {
        return "Hello World! From " + System.getenv("HOSTNAME");
    }
    //get method all enveromient variables
    @GetMapping("/env")
    public Map<String,String> getEnv() {
        return System.getenv();
    }
}
