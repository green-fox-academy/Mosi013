package com.gfa.basicwebshop.controller;

import com.gfa.basicwebshop.service.WebShopService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  private WebShopService webShopService;

  @Autowired
  public void setWebShopService(WebShopService webShopService) {
    this.webShopService = webShopService;
  }

  @ResponseBody
  @GetMapping("/webshop")
  public String greetTheWorld() {
    return "Hello World!";
  }

  @GetMapping("/")
  public String homePage(Model model) {
    model.addAttribute("items", webShopService.getShopItemList());
    return "main";
  }

  @GetMapping("/only-available")
  public String getOnlyAvailable(Model model) {
    model.addAttribute("items", webShopService.getAvailableShopItems());
    return "main";
  }

  @GetMapping("/cheapest-first")
  public String getCheapestItemFirst(Model model) {
    model.addAttribute("items", webShopService.getCheapestFirst());
    return "main";
  }

  @GetMapping("/contains-nike")
  public String getItemWhatContainsNike(Model model) {
    model.addAttribute("items", webShopService.getItemsWhatContainsNike());
    return "main";
  }

  @GetMapping("/average-stock")
  public String getAverageStock(Model model){
    model.addAttribute("items", webShopService.getAverageStock());
    return "averagestock";
  }
}
