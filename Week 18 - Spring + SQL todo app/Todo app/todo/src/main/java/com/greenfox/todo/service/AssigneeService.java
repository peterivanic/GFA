package com.greenfox.todo.service;

import com.greenfox.todo.model.Assignee;
import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repositories.AssigneesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class AssigneeService {
    private final AssigneesRepository assigneeRepository;

    public List<Assignee> findAll() {
        return (List<Assignee>) assigneeRepository.findAll();
    }
}
