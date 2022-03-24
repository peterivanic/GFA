package com.greenfoxacademy.springstart1.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloWebController {

    @RequestMapping("/web/greeting")

    public String greeting(Model model) {
        model.addAttribute("name", " World");
        return "greeting";
    }
}
