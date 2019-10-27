package com.alaposi.basicwebshop.controllers;

import com.alaposi.basicwebshop.models.ShopItem;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Controller
public class ItemController {
  private List<ShopItem> itemlist = new ArrayList<>();

  public ItemController() {
    itemlist.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5));
    itemlist.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2));
    itemlist.add(new ShopItem("Printer2", "Some HP printer that will print pages", 3000, 2));
    itemlist.add(new ShopItem("Coca cola", "0,5l standard coke", 25, 0));
    itemlist.add(new ShopItem("Wokin", "chicken with fried rice and ", 119, 100));
    itemlist.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1));
  }


  @GetMapping(value = "/basicwebshop")
  public String listItems(Model model) {
    model.addAttribute("items", itemlist);
    return "basicwebshop";
  }

  @GetMapping(value = "/only-available")
  public String availableItems(Model model) {
    List<ShopItem> availableItems = itemlist.stream()
        .filter(item -> item.getQuantityOfStock() > 0)
        .collect(Collectors.toList());
    model.addAttribute("items", availableItems);
    return "basicwebshop";
  }

  @GetMapping(value = "/cheapest-first")
  public String cheapestFirst(Model model) {
    List<ShopItem> cheapestFirst = itemlist.stream()
        .sorted(Comparator.comparingDouble(ShopItem::getPrice))
        .collect(Collectors.toList());
    model.addAttribute("items", cheapestFirst);
    return "basicwebshop";
  }

  @GetMapping(value = "/contains-nike")
  public String containsNike(Model model) {
    List<ShopItem> containsNike = itemlist.stream()
        .filter(item -> item.getDescription().toLowerCase().contains("nike") || item.getName().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
    model.addAttribute("items", containsNike);
    return "basicwebshop";
  }

  @GetMapping(value = "/average-stock")
  public String averageStock(Model model) {
    OptionalDouble average = itemlist.stream()
        .map(item -> item.getQuantityOfStock())
        .mapToDouble(item -> item)
        .average();
    model.addAttribute("text", "Average stock: ");
    model.addAttribute("filter", average.getAsDouble());
    return "basicwebshop-filter";
  }

  @GetMapping(value = "/most-expensive-available")
  public String mostExpensive(Model model) {
    ShopItem mostExpensive = itemlist.stream()
        .filter(item->item.getQuantityOfStock()>0)
        .max(Comparator.comparing(ShopItem::getPrice))
        .get();
    model.addAttribute("text", "The most expensive available item: ");
    model.addAttribute("filter", mostExpensive.getName());
    return "basicwebshop-filter";
  }

  @PostMapping(value = "/search")
  public String search(Model model, @RequestParam String searched) {
    List<ShopItem> searchedItem = itemlist.stream()
        .filter(item -> item.getDescription().toLowerCase().contains(searched.toLowerCase()) || item.getName().toLowerCase().contains(searched.toLowerCase()))
        .collect(Collectors.toList());
    model.addAttribute("items", searchedItem);
    return "basicwebshop";
  }

}
