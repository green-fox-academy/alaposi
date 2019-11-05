package com.alaposi.listingtodos.repositories;

import com.alaposi.listingtodos.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
