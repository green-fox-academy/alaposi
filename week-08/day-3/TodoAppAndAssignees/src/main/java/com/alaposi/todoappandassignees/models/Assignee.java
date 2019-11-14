package com.alaposi.todoappandassignees.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String email;
  @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)  //mapped by: mi legyen a foerign key
  @JoinColumn(name="assignee_id")
  private List<Todo> todoList;

  public Assignee() {  //üres konstruktorban is legyen arraylist
    this.todoList = new ArrayList<>();
  }

  public Assignee(String name, String email, List<Todo> todoList) {
    this.name = name;
    this.email = email;
    this.todoList = todoList;
  }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
    this.todoList = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<Todo> getTodoList() {
    return todoList;
  }

 // public void setTodoList(List<Todo> todoList) {
  public void addTodo(Todo todo) {
    todo.setAssignee(this);  //itt állítom be a todo-hoz az assignee-t
    this.todoList.add(todo);
  }

  @Override
  public String toString() {
    return this.name;
  }


}
