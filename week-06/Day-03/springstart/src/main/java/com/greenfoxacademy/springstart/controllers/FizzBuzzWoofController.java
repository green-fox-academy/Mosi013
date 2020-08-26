package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FizzBuzzWoofController {

  AtomicLong atomic = new AtomicLong(1);

  @RequestMapping(value = "/FizzBuzzWoof")
  public String fizzBuzz(Model model) {
    String fizzbuzz = "";
    long counter = atomic.getAndIncrement();
    String fontSize = "16";
    if (counter % 3 == 0 && counter % 5 == 0) {
      fizzbuzz = "fizzbuzz";
      fontSize = "48";
    } else if (counter % 3 == 0 && counter % 7 == 0) {
      fizzbuzz = "fizzwoof";
      fontSize = "48";
    } else if (counter % 5 == 0 && counter % 7 == 0) {
      fizzbuzz = "buzzwoof";
      fontSize = "48";
    } else if (counter % 3 == 0 && counter % 5 == 0 && counter % 7 == 0) {
      fizzbuzz = "fizzbuzzwoof";
      fontSize = "72";
    } else if (counter % 3 == 0) {
      fizzbuzz = "fizz";
    } else if (counter % 5 == 0) {
      fizzbuzz = "buzz";
    } else if (counter % 7 == 0) {
      fizzbuzz = "woof";
    } else {
      fizzbuzz = String.valueOf(counter);
    }
    model.addAttribute("fizzbuzz", fizzbuzz);
    model.addAttribute("fontSize", fontSize);

    return "FizzBuzzWoof";
  }
}
