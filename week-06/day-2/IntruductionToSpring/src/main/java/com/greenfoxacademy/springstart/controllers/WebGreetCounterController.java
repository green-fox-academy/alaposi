package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebGreetCounterController {
  AtomicLong atomicLong = new AtomicLong();

  @RequestMapping("/web/greeting4")
  public String greeting(Model model, @RequestParam String name) {
    model.addAttribute("name", name);
    model.addAttribute("counter", atomicLong.getAndIncrement());
    return "greeting4";
  }
}
