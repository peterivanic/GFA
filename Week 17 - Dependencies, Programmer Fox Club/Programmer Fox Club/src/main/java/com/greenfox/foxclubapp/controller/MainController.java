package com.greenfox.foxclubapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getIndex (){
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }


}
