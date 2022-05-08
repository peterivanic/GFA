package com.gfa.frontend.controller;


import com.gfa.frontend.model.Doubling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ApiController {


    @GetMapping("/doubling")
    public Doubling doDoubling(@RequestParam ("input") Optional<Double> input) {
        if (input.isPresent()){
            return new Doubling(input.get());
        }
        return new Doubling();
    }
}
