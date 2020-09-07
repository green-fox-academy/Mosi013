package com.gfa.basicwebshop.controller;

import com.gfa.basicwebshop.service.WebShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
  public String getAverageStock(Model model) {
    model.addAttribute("average", webShopService.getAverageStock());
    return "averagestock";
  }

  @GetMapping("/most-expensive")
  public String getMostExpensive(Model model) {
    model.addAttribute("items", webShopService.getMostExpensive());
    return "main";
  }

  @PostMapping("/search")
  public String getSearchedItems(String search, Model model) {
    model.addAttribute("items", webShopService.getSearchedItems(search));
    return "main";
  }

  @GetMapping("/more-filters")
  public String getMoreFilters(Model model) {
    model.addAttribute("items", webShopService.getShopItemList());
    return "morefilters";
  }

  @GetMapping("/filter-by-type/{type}")
  public String getItemByType(Model model, @PathVariable String type){
    model.addAttribute("items", webShopService.getItemByType(type));
    model.addAttribute("type", type);
    return "morefilters";
  }

}
