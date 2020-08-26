package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {

  AtomicLong atomic = new AtomicLong();

  @RequestMapping(value= "/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("name", " Márk");
    model.addAttribute("counter", atomic.getAndIncrement());
    return "greeting";
  }
}
