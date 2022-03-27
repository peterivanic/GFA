package com.greenfoxacademy.springstart1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")

    public String greeting(Model model, @RequestParam(defaultValue = "All") String name) {

        Greeting gr = new Greeting();
        Greeting.addone();
        model.addAttribute("name", name);
        model.addAttribute("count", gr.getGreetcount());
        return "greeting";
    }
}
