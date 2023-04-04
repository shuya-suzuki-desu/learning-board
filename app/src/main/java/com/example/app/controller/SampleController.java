package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
    
    @GetMapping("/")
    public ModelAndView sample(ModelAndView mav) {
        mav.addObject("name", "shuya");
        mav.setViewName("sample");
        return mav;
    }
}
