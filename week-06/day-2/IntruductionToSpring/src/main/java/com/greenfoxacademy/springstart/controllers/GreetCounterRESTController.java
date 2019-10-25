package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetCounterRESTController {
  AtomicLong atomicLong = new AtomicLong();

  @RequestMapping(value = "/greeting2")
  public Greeting2 greeting(@RequestParam String name) {
    return new Greeting2(atomicLong.getAndIncrement(), "Hello, " + name);
  }
}
