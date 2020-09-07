package com.gfa.todo.controllers;

import com.gfa.todo.models.ToDo;
import com.gfa.todo.services.ToDoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ToDoController {

  private final ToDoService toDoService;

  @Autowired
  public ToDoController(ToDoService toDoService){
    this.toDoService = toDoService;
  }

  @GetMapping("/todo")
  public String showToDos(Model model){
    model.addAttribute("todos", toDoService.getToDosList());
    return "todo";
  }

  @GetMapping("/add")
  public String renderNewTodos(Model model){
    model.addAttribute("todo", new ToDo());
    return "add";
  }
//ID alapján törlöm az URL-ből ezért kell a REQUESTPARAM
  @GetMapping("/delete")
  public String deleteProduct(@RequestParam(value = "id") long toDoId){
    toDoService.deleteProductById(toDoId);
    return "redirect:/todo";
  }


  //--------------------------------------------------------------------
  @PostMapping("/add")
  public String addNewToDo(ToDo newtodo){
    toDoService.addToDo(newtodo);
    return "redirect:/todo";
  }

//  @PostMapping("/search")
//  public String searchItems(@RequestParam String search, Model model) {
//    model.addAttribute("items", toDoService.searchItems(search));
//    return "todo";
//  }



}
