package com.greenfox.foxclubapp.service;

import com.greenfox.foxclubapp.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private List<Fox> foxes = new ArrayList<>();

    public void addFox(Fox fox){
        foxes.add(fox);
    }

}
