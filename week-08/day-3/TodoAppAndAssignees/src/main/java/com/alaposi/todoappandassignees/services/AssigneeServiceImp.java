package com.alaposi.todoappandassignees.services;

import com.alaposi.todoappandassignees.models.Assignee;
import com.alaposi.todoappandassignees.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeServiceImp implements IAssigneeService {

  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeServiceImp(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public List<Assignee> findAll() {
    List<Assignee> assigneeList = new ArrayList<>();
    assigneeRepository.findAll().forEach(assignee -> assigneeList.add(assignee));
    return assigneeList;
  }

  @Override
  public void delete(Long id) {
    assigneeRepository.deleteById(id);
  }

  @Override
//  public void addNewAssignee(String name, String email) {
////    assigneeRepository.save(new Assignee(name, email));
  //}
  public void save(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  @Override
  public void editNameOfAssignee(Long Id) {
  }
}
