package com.greenfox.todo.controller;

import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repositories.AssigneesRepository;
import com.greenfox.todo.repositories.TodoRepository;
import com.greenfox.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class TodoController {


   private final TodoRepository todoRepository;
   private final TodoService todoService;

   private final AssigneesRepository assigneesRepository;


    @GetMapping("/todo")
    public String listAll(Model model){
        model.addAttribute("todos",todoService.findAll());
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

    @GetMapping("/delete")
    public String deleteTodo(@RequestParam ("id") Long todoId){
        todoRepository.deleteById(todoId);
        return "redirect:/todo";
    }

    @GetMapping("/edit")
    public String editTodo(Model model , @RequestParam("id") Long id){
       Optional<Todo> todo = todoRepository.findById(id);
       model.addAttribute("todo",todo.get());
       return "edit";
    }

    @PostMapping("/edit")
    public String saveTodo(@ModelAttribute ("todo") Todo todo){
        todoRepository.deleteById(todo.getId());
        todoRepository.save(todo);
        return "redirect:/todo";

    }

    @GetMapping("/assignees")
    public String listAllAssignees(Model model){
        model.addAttribute("assignees",assigneesRepository.findAll());
        return "assignees";
    }

    @GetMapping("/delAssignees")
    public String deleteAss(@RequestParam ("id") Long assId){
        assigneesRepository.deleteById(assId);
        return "redirect:/assignees";
    }
}
