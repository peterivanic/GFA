package com.greenfoxacademy.springstart1.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    private static AtomicLong greetcount = new AtomicLong();
    private String name;

    public Greeting( String content) {

        this.name = content;
    }

    public AtomicLong getGreetcount() {
        return greetcount;
    }

    public String getName() {
        return name;
    }

    public static void addone(){
       greetcount.getAndIncrement();
    }
}
