package com.greenfox.todo.service;


import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repositories.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class TodoServiceImpl implements TodoService{

    private final TodoRepository todoRepository;

    @Override
    public List<Todo> findAll() {
        return (List<Todo>) todoRepository.findAll();
    }

    public List<Todo> findAllUndone() {
        return (List<Todo>) todoRepository.findAll();
    }
}
