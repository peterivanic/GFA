package com.greenfoxacademy.springstart1.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting",method = RequestMethod.GET)
    @ResponseBody
    public Greeting greeting(@RequestParam(defaultValue = "all") String name){

        Greeting gr = new Greeting(name);

        Greeting.addone();

        return gr;
    }

}
