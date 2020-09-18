package com.gfa.databaseintegration.controllers;

import com.gfa.databaseintegration.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {


  private final TodoRepository todoRepository;

  @Autowired
  TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value = {"/products", "/"}, method = RequestMethod.GET)
  public String list(Model model) {
      model.addAttribute("todos",todoRepository.findAll());
    return "todolist";

  }
}