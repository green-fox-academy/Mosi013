package com.gta.workshop.utilities.controllers;

import com.gta.workshop.utilities.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UtilityController {

  private UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService){
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String getUseful(){
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String getColored(Model model){
    model.addAttribute("randomColor", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String getEmail(Model model, @RequestParam String email){
    model.addAttribute("emailAddress", email);
    model.addAttribute("validation", utilityService.validateEmail(email));
    return "email";
  }

}
