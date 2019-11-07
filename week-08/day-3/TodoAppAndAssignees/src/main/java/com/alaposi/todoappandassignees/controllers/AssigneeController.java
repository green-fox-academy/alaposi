package com.alaposi.todoappandassignees.controllers;

import com.alaposi.todoappandassignees.models.Assignee;
import com.alaposi.todoappandassignees.services.IAssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  private IAssigneeService assigneeService;

  @Autowired
  public AssigneeController(IAssigneeService assigneeService) {
    this.assigneeService = assigneeService;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("assignees", assigneeService.findAll());
    return "assignees";
  }

//  @PostMapping(value = "/add")
//  public String addNewAssignee(Model model, @RequestParam String name, String email){
//    model.addAttribute("add", assigneeService.addNewAssignee(name, email));
//  }

  @GetMapping(value = "/add")
  public String add(@ModelAttribute(name = "assignee") Assignee assignee) {
  //  public String add() {
      return "addassignee";
  }

  @PostMapping(value = "/add")
  public String save(@ModelAttribute(name = "assignee") Assignee assignee) {
    assigneeService.save(assignee);
    return "redirect:/assignee/list";
  }

  @DeleteMapping(value = "/{id}/delete")
  public String delete(@PathVariable(name = "id") Long id) {
    assigneeService.delete(id);
    return "redirect:/assignee/list";
  }

}

