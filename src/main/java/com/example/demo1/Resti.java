package com.example.demo1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Resti {

    @RequestMapping("/resti")
    public String hello() {
        return "Hello world";
    }
}