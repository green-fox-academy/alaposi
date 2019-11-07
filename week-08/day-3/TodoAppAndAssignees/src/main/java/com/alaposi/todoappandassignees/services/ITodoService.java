package com.alaposi.todoappandassignees.services;


import com.alaposi.todoappandassignees.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ITodoService {
  List<Todo> findAll();
  Iterable<Todo> findAllByDone(Boolean done);  //ez a repository-ból jön
  //List<Todo> findAllByUrgentAndDone(Boolean urgent, Boolean done);
  List<Todo> searched(String searchedTodo);
  void save(Todo todo);


}
