package com.greenfox.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {



    @GetMapping("/todo")
    @ResponseBody
    public String list(){
        return "This is my first Todo";
    }
}
