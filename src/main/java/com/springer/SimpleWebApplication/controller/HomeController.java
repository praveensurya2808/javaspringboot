package com.springer.SimpleWebApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String welcome(){
        return "Welcome to Magic world";
    }
    @RequestMapping("/about")
    public String about(){
        return "Iam the next big thing in the world";
    }
}
