package com.alaposi.listingtodos.services;

import com.alaposi.listingtodos.models.Todo;
import com.alaposi.listingtodos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

  private TodoRepository todoRepository;

  @Autowired
  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;

  }

  public List<Todo> findAll(){
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todo->todoList.add(todo));
    return todoList;
  }


}
