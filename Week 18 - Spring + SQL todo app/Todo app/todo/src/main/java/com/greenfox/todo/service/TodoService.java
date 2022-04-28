package com.greenfox.todo.service;

import com.greenfox.todo.model.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> findAll();
}
