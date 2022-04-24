package com.greenfox.todo.service;


import com.greenfox.todo.repositories.TodoRepository;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{

    private final TodoRepository todoRepository;

}
