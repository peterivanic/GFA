package com.gfa.frontend.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doubling {

    private double received;
    private double result;
    private String error;

    public Doubling(double received) {
        this.received = received;
        this.result = received *2;
    }

    public Doubling() {
        this.error = "Please provide an input!";
    }
}
