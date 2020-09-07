package com.gfa.programmerfoxclub.controllers;

import com.gfa.programmerfoxclub.models.Fox;
import com.gfa.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService){
    this.foxService = foxService;
  }

  @GetMapping
  public String getIndex() {
    return "index";
  }

  @GetMapping("/login")
  public String getLogin(){
    return "login";
  }
}
