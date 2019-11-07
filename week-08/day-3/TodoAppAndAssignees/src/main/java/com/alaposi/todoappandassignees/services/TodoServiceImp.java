package com.alaposi.todoappandassignees.services;


import com.alaposi.todoappandassignees.models.Todo;
import com.alaposi.todoappandassignees.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImp implements ITodoService {

  private TodoRepository todoRepository;

  @Autowired
  public TodoServiceImp(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;

  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todo -> todoList.add(todo));
    return todoList;
  }

  @Override
  public Iterable<Todo> findAllByDone(Boolean done) {
    if (done != null) {
      return todoRepository.findAllByDone(!done);
    } else {
//      List<Todo> allTodo = new ArrayList<>();      //csinálok egy üres listát
//      todoRepository.findAll().forEach(todo -> allTodo.add(todo));  //minden elemet belerakok
//      return allTodo;
      return todoRepository.findAll();
    }
  }

  @Override
  public List<Todo> searched(String searchedTodo) {
    return todoRepository.findTodoByActionNamePart("%" + searchedTodo + "%");
  }

  @Override
  public void save(Todo todo) {
    todoRepository.save(todo);
  }

//  @Override
//  public List<Todo> findAllByUrgentAndDone(Boolean urgent, Boolean done){
//    return todoRepository.findAll() ) {
//
//    }
//  }


}
