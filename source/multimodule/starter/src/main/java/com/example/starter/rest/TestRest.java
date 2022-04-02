package com.example.starter.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestRest {

    @GetMapping("/test")
    public String test() {
        return "test this shit";
    }
}
