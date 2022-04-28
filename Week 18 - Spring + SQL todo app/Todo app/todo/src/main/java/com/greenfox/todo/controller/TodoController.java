package com.greenfox.todo.controller;

import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repositories.TodoRepository;
import com.greenfox.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class TodoController {


   private final TodoRepository todoRepository;
   private final TodoService todoService;


    @GetMapping("/todo")
    public String listUndone(Model model){
        model.addAttribute("todos",todoService.findAll().stream()
                        .filter(x->!x.isDone())
                        .collect(Collectors.toList())
                        );
        return "todolist";
    }

    @GetMapping("/addTodo")
    public String addNew(){
        return "addTodo";
    }

    @PostMapping("/addTodo")
    public String handleData(@RequestParam("text") String text){
        Todo todo = new Todo();
        todo.setTitle(text);
        todoRepository.save(todo);
        return "redirect:/todo";
    }
}
