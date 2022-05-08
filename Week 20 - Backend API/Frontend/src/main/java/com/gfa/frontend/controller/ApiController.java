package com.gfa.frontend.controller;


import com.gfa.frontend.model.Doubling;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Map> greet(@RequestParam("name") Optional<String> name,
                                     @RequestParam("title") Optional<String> title) {
        Map<String, String> obj = new HashMap<>();
        HttpStatus status = HttpStatus.OK;
        if (name.isEmpty() && title.isEmpty()){
            status = HttpStatus.BAD_REQUEST;
            obj.put("error", "Please provide a name and a title!");

        }else if (name.isEmpty()) {
            status = HttpStatus.BAD_REQUEST;
            obj.put("error", "Please provide a name!");
        } else if (title.isEmpty()) {
            status = HttpStatus.BAD_REQUEST;
            obj.put("error", "Please provide a title!");
        }
        if (name.isPresent() && title.isPresent()) {

            obj.put("welcome_message", String.format("Oh, hi there %s, my dear %s!", name.get(), title.get()));
        }
        return ResponseEntity.status(status).body(obj) ;
    }

    @GetMapping("/appenda/{word}")
    public ResponseEntity<Map> appendA(@PathVariable("word") String word){
        Map<String,String> obj = new HashMap<>();
        HttpStatus status = HttpStatus.OK;
        obj.put("appended",word.concat("a"));
        return ResponseEntity.status(status).body(obj);
    }

}
