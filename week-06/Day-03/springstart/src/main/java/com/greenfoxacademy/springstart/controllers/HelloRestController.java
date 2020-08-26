package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

  AtomicLong atomic = new AtomicLong();

  @RequestMapping(path = "/greeting")
  public Greeting greeting(@RequestParam String name){
    return new Greeting(atomic.getAndIncrement(), "Hello, " + name + "!");
  }
}
