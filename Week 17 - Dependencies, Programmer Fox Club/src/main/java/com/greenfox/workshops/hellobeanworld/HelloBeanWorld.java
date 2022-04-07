package com.greenfox.workshops.hellobeanworld;

import com.greenfox.workshops.colors.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class HelloBeanWorld implements CommandLineRunner {

    public Printer printer;

    @Autowired
    public HelloBeanWorld(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");
    }
}
