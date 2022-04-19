package com.greenfox.foxclubapp.controller;


import com.greenfox.foxclubapp.model.Fox;
import com.greenfox.foxclubapp.service.FoxService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
@RequiredArgsConstructor
public class MainController {

    private @NonNull FoxService foxService;

    @GetMapping
    public String getHome(
            Model model,
            @RequestParam(
                    value = "name", required = false) String name) {

        if (Objects.isNull(name)) {
            return "redirect:/login";
        }
        Fox fox =  foxService.getFox(name);
        model.addAttribute("fox", fox);

        return "index";
    }





}
