package com.geeenfox.basicwebshop.controllers;

import com.geeenfox.basicwebshop.models.ShopItem;
import com.geeenfox.basicwebshop.services.ShopItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebShopController {


    @GetMapping("/")
    public String getIndex(Model model){

        model.addAttribute("items", ShopItemService.getItems());
        return "index";
    }





}
