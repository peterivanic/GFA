package com.greenfox.foxclubapp.controller;

import com.greenfox.foxclubapp.model.Fox;
import com.greenfox.foxclubapp.service.FoxService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
@RequiredArgsConstructor
public class FoxController {

    private @NonNull FoxService foxService;


    @GetMapping("/login")
    public String getForm(@ModelAttribute("fox") Fox fox) {
        return "login";
    }

    @PostMapping("/login")
    public String handleFormData(Model model, @ModelAttribute("fox") Fox fox) {

        if (Objects.isNull(fox.getName()) || fox.getName().isBlank()) {
            return "login";
        }
        foxService.addFox(fox);
        model.addAttribute("food", fox.getFood());
        model.addAttribute("drink", fox.getDrink());
        if (fox.getListOfTricks().isEmpty()) {
            model.addAttribute("numbOfTricks", 0);
        } else {
            model.addAttribute("numbOfTricks", fox.getListOfTricks().size());
        }
        return "redirect:/?name=" + fox.getName();
    }

    @GetMapping("/nutritionStore")
    public String getNutrition(Model model ,@RequestParam(name = "name") String name) {
        Fox fox =  foxService.getFox(name);
        model.addAttribute("fox", fox);
        return "nutrition";
    }

    @PostMapping("/nutritionStore")
    public String handleNutritionData(@RequestParam(name = "name") String name,
                                      @RequestParam(name = "Food") String food,
                                      @RequestParam(name = "Drink") String drink) {
       Fox fox =  foxService.getFox(name);
       fox.setFood(food);
       fox.setDrink(drink);

        return "redirect:/?name=" + fox.getName();
    }

    @GetMapping("/trickCenter")
    public String getTricks() {
        return "tricks";
    }
}
