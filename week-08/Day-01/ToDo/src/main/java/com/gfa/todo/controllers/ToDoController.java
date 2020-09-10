package com.gfa.todo.controllers;

import com.gfa.todo.models.ToDo;
import com.gfa.todo.services.ToDoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    return "index";
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

  @GetMapping("/edit/{id}")
  public String editapl(@PathVariable(value = "id") Long id, Model model ) {
    model.addAttribute("todos", toDoService.getTodoById(id));
    return "edit";
  }

  //--------------------------------------------------------------------
  @PostMapping("/add")
  public String addNewToDo(ToDo newtodo){
    toDoService.addToDo(newtodo);
    return "redirect:/todo";
  }

  @PostMapping("/edit/{id}")
  public String editTodo(ToDo todo){
    toDoService.editTodo(todo);
    return "redirect:/todo";
  }

//  @PostMapping("/search")
//  public String searchItems( String search, Model model) {
//    model.addAttribute("items", toDoService.searchItems(search));
//    return "todo";
//  }

//ha valaki rákattint az inputra akkor átdob a mezőbe label for
//a name keresi a back end en a változót

}
