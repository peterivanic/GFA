package com.greenfox.todo.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "todo_table")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;

    private String description;
    private boolean urgent;
    private boolean done;

    @ManyToOne()
    private Assignee assignee;

    @CreationTimestamp
    private LocalDateTime created;

    public Todo() {
        urgent = false;
        done = false;
    }

    public Todo(String title) {
        this.title = title;
    }
}
