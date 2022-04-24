package com.greenfox.todo.controller;

import com.greenfox.todo.repositories.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class TodoController {


   final TodoRepository todoRepository;

    @GetMapping("/todo")
    public String list(Model model){
        model.addAttribute("todos",todoRepository.findAll());
        return "todolist";
    }
}
