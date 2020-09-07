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
        new ShopItem("Running shoes", "Clothes and Shoes", "NIke running shoes for every day sport", 1000.0, 5),
        new ShopItem("Printer", "Electronics", "Some HP printer that will print pages", 3000.0, 2),
        new ShopItem("Coca cola", "Beverages and Snacks", "0.5l standard coke", 25.0, 0),
        new ShopItem("Wokin", "Beverages and Snacks", "Chicken with fried rice and WOKIN sauce", 119.0, 100),
        new ShopItem("T-shirt", "Clothes and Shoes", "Blue with a corgi on a bike", 300.0, 1)
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

  public double getAverageStock() {
    return shopItemList.stream()
        .mapToDouble(item -> item.getQuantityOfStock())
        .average()
        .getAsDouble();
  }

  public ShopItem getMostExpensive() {
    return shopItemList.stream()
        .filter(item -> item.getQuantityOfStock() > 0)
        .max(Comparator.comparing(ShopItem::getPrice))
        .get();

  }

  public List<ShopItem> getSearchedItems(String search) {
    return shopItemList.stream()
        .filter(item -> item.getName().toLowerCase().contains(search) ||
            item.getDescription().toLowerCase().contains(search))
        .collect(Collectors.toList());
  }

  public List<ShopItem> getItemByType(String type) {
    return shopItemList.stream()
        .filter(item -> item.getType().equals(type))
        .collect(Collectors.toList());
  }
}
