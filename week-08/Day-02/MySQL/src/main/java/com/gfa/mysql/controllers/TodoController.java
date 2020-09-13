package com.gfa.mysql.controllers;

import com.gfa.mysql.models.Todo;
import com.gfa.mysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {


  private final TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService){
    this.todoService = todoService;
  }

  @RequestMapping(value = {"/todo", "/"}, method = RequestMethod.GET)
  public String listAllTodos(Model model) {
    model.addAttribute("todos", todoService.listAllTodos());
    return "todolist";
  }

  @GetMapping("/add")
  public String renderAddTodo(Model model){
    model.addAttribute("newTodo", new Todo());
    return "add-todo";
  }

  @GetMapping(value = "/{id}/deleteTodo")
  public String deleteTodo(@PathVariable Long id) {
    todoService.deleteTodoById(id);
    return "redirect:/todo";
  }

  @GetMapping(value = "/{id}/editTodo")
  public String renderEditById(@PathVariable Long id, Model model) {
    model.addAttribute("editTodo", todoService.getTodoById(id));
    return "edit";
  }

  //---------------------------------------------------------------------

  @PostMapping("/add")
  public String addNewTodo(@ModelAttribute Todo todo){
    todoService.addNewTodo(todo);
    return "redirect:/todo";
  }

  @PostMapping("/{id}/editTodo")
  public String editTodo(@ModelAttribute Todo todo){
    todoService.updateTodo(todo);
    return "redirect:/todo";
  }
}
