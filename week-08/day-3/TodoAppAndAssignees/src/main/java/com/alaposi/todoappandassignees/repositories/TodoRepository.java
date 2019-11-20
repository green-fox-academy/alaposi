package com.alaposi.todoappandassignees.repositories;

import com.alaposi.todoappandassignees.models.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAllByDone(Boolean done);
  //List<Todo> findAllByUrgentAndDone(Boolean urgent, Boolean active);

  @Query(value = "select * FROM Todo t WHERE t.action Like :partOfAction", nativeQuery = true)
  List<Todo> findTodoByActionNamePart(@Param("partOfAction") String searched);

  @Query(value = "select * FROM Todo t WHERE date(t.action) = date(:dueDate) ", nativeQuery = true)
  List<Todo> findTodoByDueDate(@Param("dueDate") Date dueDate);

}
