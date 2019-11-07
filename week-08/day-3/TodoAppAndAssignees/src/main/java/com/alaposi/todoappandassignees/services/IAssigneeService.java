package com.alaposi.todoappandassignees.services;

import com.alaposi.todoappandassignees.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IAssigneeService {
  List<Assignee> findAll();

  void delete(Long id);

  //void addNewAssignee(String name, String email);
  void save(Assignee assignee);

  void editNameOfAssignee(Long Id);
}
