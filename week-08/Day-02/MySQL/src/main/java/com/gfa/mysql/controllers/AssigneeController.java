package com.gfa.mysql.controllers;

import com.gfa.mysql.models.Assignee;
import com.gfa.mysql.models.Todo;
import com.gfa.mysql.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AssigneeController {

  private AssigneeService assigneeService;

  @Autowired
  public AssigneeController (AssigneeService assigneeService){
    this.assigneeService = assigneeService;
  }

  @GetMapping("/assignees")
  public String listAssignees(Model model){
    model.addAttribute("assignees", assigneeService.getAssignees());
    return "assignee";
  }

  @GetMapping(value = "/{id}/editAssignee")
  public String renderEditById(@PathVariable Long id, Model model, Assignee assignee) {
    model.addAttribute("editAssignee", assigneeService.getAssigneeById(id));
    return "edit-assignee";
  }

  @GetMapping(value = "/{id}/deleteAssignee")
  public String deleteTodo(@PathVariable Long id) {
    assigneeService.deleteAssigneeById(id);
    return "redirect:/assignees";
  }

  @GetMapping("/add-assignee")
  public String renderAddAssigneePage(Model model){
    model.addAttribute("newAssigne", new Assignee());
    return "add-assignee";
  }

  //------------------------------------------------------------------------------------
  @PostMapping("/{id}/editAssignee")
  public String editTodo(@ModelAttribute Assignee editAssignee){
    assigneeService.updateAssingee(editAssignee);
    return "redirect:/assignees";
  }

  @PostMapping("/add-assignee")
  public String addNewAssignee(@ModelAttribute Assignee assignee){
    assigneeService.addNewAssignee(assignee);
    return "redirect:/assignees";
  }

}
