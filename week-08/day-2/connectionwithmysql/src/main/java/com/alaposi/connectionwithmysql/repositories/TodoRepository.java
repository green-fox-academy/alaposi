package com.alaposi.connectionwithmysql.repositories;

import com.alaposi.connectionwithmysql.models.Todo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAllByDone(Boolean active);
  List<Todo> findAllByUrgentAndDone(Boolean urgent, Boolean active);
}
