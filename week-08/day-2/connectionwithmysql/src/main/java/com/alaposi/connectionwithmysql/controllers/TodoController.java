package com.alaposi.connectionwithmysql.controllers;


import com.alaposi.connectionwithmysql.services.TodoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")  //így minden end point úgy kezdődik, hogy /todo
public class TodoController {

  private TodoServiceImp service;

  @Autowired
  public TodoController(TodoServiceImp todoServiceImp) {
    this.service = todoServiceImp;
  }

//  @GetMapping(value = {"/", "/list"})
//  public String list(Model model) {
//    model.addAttribute("todos", todoService.findAll());
//    return "todolist";
//  }

  @GetMapping(value = {"/", "/list"})
  public String list(@RequestParam (required = false) Boolean isActive, Model model) {
    //Boolean active = isActive.equals("true") ? true : false;
    model.addAttribute("todos", service.findAllByDone(isActive));
    //model.addAttribute("todos", service.findAllByUrgentAndDone
    return "todolist";
  }

}
