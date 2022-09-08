package com.example.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author DeYou
 * @date 2022/9/8
 */
@RequestMapping("/test")
@Controller
public class TestHandler {
    @GetMapping("/hello")
    public String index(HttpServletRequest request){
        String str = "Hello Spring MVC!";
        request.setAttribute( "str", str );
        return "hello";
    }
}