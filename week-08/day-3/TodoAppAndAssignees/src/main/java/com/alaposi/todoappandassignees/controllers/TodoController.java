package com.alaposi.todoappandassignees.controllers;

import com.alaposi.todoappandassignees.models.Assignee;
import com.alaposi.todoappandassignees.models.Todo;
import com.alaposi.todoappandassignees.services.AssigneeServiceImp;
import com.alaposi.todoappandassignees.services.IAssigneeService;
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
  private IAssigneeService assigneeService;

  @Autowired
  public TodoController(ITodoService service, IAssigneeService assigneeService) {
    this.service = service;
    this.assigneeService = assigneeService;
  }

//  @GetMapping(value = {"/", "/list"})
//  public String list(Model model) {
//    model.addAttribute("todos", todoService.findAll());
//    return "todolist";
//  }

  @GetMapping(value = {"/", "/list"})
  public String list(@RequestParam(required = false) Boolean isActive, Model model) {
    //Boolean active = isActive.equals("true") ? true : false;
    //List<Todo> list = service.findAllByDone(isActive);
    model.addAttribute("todos", service.findAllByDone(isActive));
    // model.addAttribute("assignee", assigneeService)
    //model.addAttribute("todos", service.findAllByUrgentAndDone
    return "todolist";
  }

  @PostMapping(value = {"/", "/list"})
  public String search(Model model, @RequestParam String searched) {
    model.addAttribute("todos", service.searched(searched));
    return "todolist";
  }

  @GetMapping(value = "/add")
  public String add(@ModelAttribute(name = "todo") Todo todo) {
    return "addtodo";
  }

  @PostMapping(value = "/add")
  public String save(@ModelAttribute(name = "todo") Todo todo) {
    service.save(todo);
    return "redirect:/todo/list";
  }

  // @GetMapping(value = "/delete/{id}")
  //@GetMapping(value = "/{id}/delete")
  @GetMapping(value = "/{id}/delete")
  public String delete(@PathVariable(name = "id") Long id) {
    service.delete(service.findById(id));
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/{id}/edit")
  public String showEditForm(Model model, @PathVariable(name = "id") Long id) {
    model.addAttribute("editedTodo", service.findById(id));
    model.addAttribute("assignees", assigneeService.findAll());
    return "edit";
  }

  @PostMapping(value = "/{editedId}/edit")
  public String edit(@ModelAttribute Todo edited, @PathVariable(name = "editedId") Long currentTodoId) {
    edited.setId(currentTodoId);
    edited.setAssignee(assigneeService.findById(edited.getAssigneeIdForEditing()));
    service.save(edited);
    return "redirect:/todo/list";
  }


}
