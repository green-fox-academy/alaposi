package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {

  @RequestMapping("/web/greeting3")
  public String greeting(Model model) {
    model.addAttribute("name", " Cica");
    return "greeting3";
  }
}
