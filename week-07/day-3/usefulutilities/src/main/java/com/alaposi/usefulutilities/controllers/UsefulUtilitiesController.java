package com.alaposi.usefulutilities.controllers;

import com.alaposi.usefulutilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilitiesController {

  UtilityService utilityService;

  @Autowired
  public UsefulUtilitiesController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping(value = "/useful")
  public String display() {
    return "index";
  }

  @GetMapping(value = "/useful/colored")
  public String displayEmpty(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "empty";
  }

  @GetMapping(value = "/useful/email")
  public String emailValidator(@RequestParam String email, Model model) {
    if (utilityService.validateEmail(email)) {
      model.addAttribute("text", email + " is a valid email address");
      model.addAttribute("color", "green");
    } else {
      model.addAttribute("text", email + " is not a valid email address");
      model.addAttribute("color", "red");
    }
    return "email";
  }

  @GetMapping(value = "/useful/ceasarencoder")
  public String ceasarEncoder(@RequestParam String text, @RequestParam int number, Model model) {
    model.addAttribute("encode", utilityService.caesar(text, number));
    return "ceasar";
  }

  @GetMapping(value = "/useful/ceasardecoder")
  public String ceasarDecoder(@RequestParam String text, @RequestParam int number, Model model) {
    model.addAttribute("encode", utilityService.caesar(text, -number));
    return "ceasar";
  }
}