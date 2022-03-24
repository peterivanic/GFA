package com.greenfoxacademy.springstart1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting",method = RequestMethod.GET)
    @ResponseBody
    public Greeting greeting(@RequestParam String name){
        return new Greeting(1,name);
    }

}
