package com.greenfox.foxclubapp.controller;

import com.greenfox.foxclubapp.model.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;
@Controller
public class FoxController {

    @GetMapping("/login")
    public String getForm(@ModelAttribute("fox")Fox fox){
        return "login";
    }

    @PostMapping("/login")
    public String handleFormData(@ModelAttribute("fox") Fox fox){

        if (Objects.isNull(fox.getName() )|| fox.getName().isBlank()){
            return "login";
        }

        return "redirect:/?name="+ fox.getName();
    }
}
