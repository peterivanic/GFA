package com.greenfox.workshops.colors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Colors implements CommandLineRunner {

    MyColor color;
    @Autowired
    public Colors(MyColor color){
        this.color = color;
    }

    @Override
    public void run(String... args) throws Exception {

        color.printColor();
    }
}
