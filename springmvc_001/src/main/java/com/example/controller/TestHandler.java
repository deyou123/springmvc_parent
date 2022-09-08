package com.example.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DeYou
 * @date 2022/9/8
 */
@RequestMapping("/test")
@Controller
public class TestHandler {
    @GetMapping("/index")
    public String index(){
        return "hello";
    }
}