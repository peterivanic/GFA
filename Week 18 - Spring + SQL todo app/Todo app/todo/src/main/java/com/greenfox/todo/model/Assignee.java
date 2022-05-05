package com.greenfox.todo.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @OneToMany(mappedBy = "assignee", cascade = CascadeType.ALL)
    private Set<Todo> todoSet = new HashSet<>();

    public Assignee(String name) {
        this.name = name;

        this.email = "123@email.com";
    }

    public Assignee() {
    }

    @Override
    public String toString() {
        return name;
    }
}
