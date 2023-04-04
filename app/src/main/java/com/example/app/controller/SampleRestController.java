package com.example.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
    
    @GetMapping("api")
    public String sampleApi() {
        return "hello spring rest";
    }
}
