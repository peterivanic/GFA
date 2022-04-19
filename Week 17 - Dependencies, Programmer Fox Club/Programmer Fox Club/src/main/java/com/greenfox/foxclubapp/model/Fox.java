package com.greenfox.foxclubapp.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data

public class Fox {

    private String name;
    private List<String> listOfTricks;
    private String food;
    private String drink;

    public Fox(String name) {
        this.name = name;
        listOfTricks = new ArrayList<>();
    }
}
