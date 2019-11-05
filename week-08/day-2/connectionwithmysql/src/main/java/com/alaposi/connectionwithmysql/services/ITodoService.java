package com.alaposi.connectionwithmysql.services;

import com.alaposi.connectionwithmysql.models.Todo;

import java.util.List;

public interface ITodoService {
  List<Todo> findAll();
  List<Todo> findAllByDone(Boolean active);  //ez a repository-ból jön
  //List<Todo> findAllByUrgentAndDone(Boolean urgent, Boolean done);
}
