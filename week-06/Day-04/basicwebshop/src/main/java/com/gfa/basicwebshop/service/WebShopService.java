package com.gfa.basicwebshop.service;

import com.gfa.basicwebshop.model.ShopItem;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class WebShopService {

  private List<ShopItem> shopItemList;


  public WebShopService() {
    this.shopItemList = addShopItem();
  }

  public List<ShopItem> addShopItem() {
    return Arrays.asList(
        new ShopItem("Running shoes", "NIke running shoes for every day sport", 1000.0, 5),
        new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2),
        new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0),
        new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100),
        new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1)
    );
  }

  public List<ShopItem> getShopItemList() {
    return shopItemList;
  }

  public List<ShopItem> getAvailableShopItems() {
    return shopItemList.stream()
        .filter(item -> item.getQuantityOfStock() > 0)
        .collect(Collectors.toList());
  }

  public List<ShopItem> getCheapestFirst() {
    return shopItemList.stream()
        .sorted(Comparator.comparing(item -> item.getPrice()))
        .collect(Collectors.toList());
  }

  public List<ShopItem> getItemsWhatContainsNike() {
    return shopItemList.stream()
        .filter(item -> item.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
  }

  public double getAverageStock(){
    Double num = shopItemList.stream()
        .mapToDouble(item -> item.getQuantityOfStock())
        .average()
        .orElseThrow();
    return num;
  }
}
