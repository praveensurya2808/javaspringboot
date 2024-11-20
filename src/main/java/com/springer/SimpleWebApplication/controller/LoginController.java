package com.springer.SimpleWebApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class LoginController {
    @RequestMapping("/login")
    public String page(){
        return "login page shows here pls provide login creds";
    }

}
