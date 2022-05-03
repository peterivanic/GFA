package com.greenfox.todo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "todo_table")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private boolean urgent;
    private boolean done;

    @ManyToOne
    private Assignee assignee;

    public Todo() {
        urgent = false;
        done = false;
    }

    public Todo(String title) {
        this.title = title;
    }
}
