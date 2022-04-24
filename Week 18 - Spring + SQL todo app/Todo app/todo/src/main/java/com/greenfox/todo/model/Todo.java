package com.greenfox.todo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Todo {
    private long id;
    private String title;
    private boolean urgent;
    private boolean done;

    public Todo() {
        urgent = false;
        done = false;
    }
}
