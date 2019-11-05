package com.alaposi.connectionwithmysql.services;


import com.alaposi.connectionwithmysql.models.Todo;
import com.alaposi.connectionwithmysql.repositories.TodoRepository;
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
  public List<Todo> findAllByDone(Boolean active) {
    if (active != null) {
      return todoRepository.findAllByDone(!active);
    } else {
      List<Todo> allTodo = new ArrayList<>();      //csinálok egy üres listát
      todoRepository.findAll().forEach(todo -> allTodo.add(todo));  //minden elemet belerakok
      return allTodo;
    }
  }

//  @Override
//  public List<Todo> findAllByUrgentAndDone(Boolean urgent, Boolean done){
//    return todoRepository.findAll() ) {
//
//    }
//  }


}
