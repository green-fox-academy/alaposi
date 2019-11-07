package com.alaposi.todoappandassignees.repositories;

import com.alaposi.todoappandassignees.models.Assignee;
import com.alaposi.todoappandassignees.models.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

  @Query(value = "select * FROM Todo t WHERE t.action Like :partOfAction", nativeQuery = true)
  List<Todo> findTodoByActionNamePart(@Param("partOfAction") String searched);
}
