package com.gfa.frontend.controller;


import com.gfa.frontend.model.Doubling;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class ApiController {


    @GetMapping("/doubling")
    public Doubling doDoubling(@RequestParam("input") Optional<Double> input) {
        if (input.isPresent()) {
            return new Doubling(input.get());
        }
        return new Doubling();
    }

    @GetMapping("/greeter")
    public Map<String, String> greet(@RequestParam("name") Optional<String> name,
                                     @RequestParam("title") Optional<String> title) {
        Map<String, String> obj = new HashMap<>();
        if (name.isEmpty() && title.isEmpty()){
            obj.put("error", "Please provide a name and a title!");

        }else if (name.isEmpty()) {
            obj.put("error", "Please provide a name!");
        } else if (title.isEmpty()) {
            obj.put("error", "Please provide a title!");
        }
        if (name.isPresent() && title.isPresent()) {

            obj.put("welcome_message", String.format("Oh, hi there %s, my dear %s!", name.get(), title.get()));
        }
        return obj;
    }

    @GetMapping("/appenda")
    @ResponseStatus(code = HttpStatus.OK)
    public Map<String ,String> appendA(@RequestParam("word") String word){
        Map<String,String> obj = new HashMap<>();
        obj.put("appended",word.concat("a"));
        return obj;
    }

}
