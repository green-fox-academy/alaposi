package com.alaposi.todoappandassignees.controllers;

import com.alaposi.todoappandassignees.models.Todo;
import com.alaposi.todoappandassignees.services.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")  //így minden end point úgy kezdődik, hogy /todo
public class TodoController {

  private ITodoService service;

  @Autowired
  public TodoController(ITodoService service) {
    this.service = service;
  }

//  @GetMapping(value = {"/", "/list"})
//  public String list(Model model) {
//    model.addAttribute("todos", todoService.findAll());
//    return "todolist";
//  }

  @GetMapping(value = {"/", "/list"})
  public String list(@RequestParam(required = false) Boolean isActive, Model model) {
    //Boolean active = isActive.equals("true") ? true : false;
    model.addAttribute("todos", service.findAllByDone(isActive));
    //model.addAttribute("todos", service.findAllByUrgentAndDone
    return "todolist";
  }

  @PostMapping(value = {"/", "/list"})
  public String search(Model model, @RequestParam String searched) {
    model.addAttribute("todos", service.searched(searched));
    return "todolist";
  }

  @GetMapping(value = "/add")
  public String add(@ModelAttribute (name = "todo") Todo todo){
    return "addtodo";
  }

  @PostMapping(value = "/add")
  public String save(@ModelAttribute (name ="todo") Todo todo){
    service.save(todo);
    return "redirect:/todo/list";
  }

}