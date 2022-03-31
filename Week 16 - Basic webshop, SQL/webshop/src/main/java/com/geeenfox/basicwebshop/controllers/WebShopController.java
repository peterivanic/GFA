package com.geeenfox.basicwebshop.controllers;

import com.geeenfox.basicwebshop.models.ShopItem;
import com.geeenfox.basicwebshop.services.ShopItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;


@Controller
public class WebShopController {


    @GetMapping("/")
    public String getIndex(Model model,
    @RequestParam (value = "search",required = false)String search){

        if (Objects.nonNull(search)){
            model.addAttribute("items", ShopItemService.getItems().stream()
                    .filter(x -> x.getName().contains(search)||x.getDescription().contains(search))
                    .collect(Collectors.toList()));

        }else {
            model.addAttribute("items", ShopItemService.getItems());
        }


        return "index";
    }

    @GetMapping("/onlyavalible")
    public String onlyAvalible(Model model){

        model.addAttribute("items",ShopItemService.getItems().stream()
                .filter(x-> x.getQuantityOfStock()>0)
                .collect(Collectors.toList()));
        return "index";
    }

    @GetMapping("/cheapest-first")
    public String cheapesFirst(Model model){
        model.addAttribute("items",ShopItemService.getItems().stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList()));

        return "index";
    }
    @GetMapping("/mostexpensive-first")
    public String expenciveFirst(Model model){
        model.addAttribute("items",ShopItemService.getItems().stream()
                .sorted(Comparator.comparing(ShopItem::getPrice,Comparator.reverseOrder()))
                .collect(Collectors.toList()));

        return "index";
    }

    @GetMapping("detail/{item}")
    public String showDetail(Model model,@PathVariable("item") Integer itemOrder){
        model.addAttribute("item",ShopItemService.getItems().get(itemOrder));
        return "detail";
    }


}
