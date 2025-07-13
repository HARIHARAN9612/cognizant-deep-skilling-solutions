package com.hari.springwebproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class
HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from REST API!";
    }
}
