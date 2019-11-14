package com.alaposi.todoappandassignees.models;

import javax.persistence.*;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  //automatikusan növeli az értéket
  private Long id;
  @Column(name = "action")
  private String title;
  private boolean urgent = false;
  private boolean done = false;
  @Transient
  private Long assigneeId;
//  private String assigneeName;

  @ManyToOne  //ide nem kell semmi, mert a oneToMany-nél  meg van adva.
  private Assignee assignee;


  public Todo(long id, String title, boolean urgent, boolean done, Assignee assignee) {
    this.id = id;
    this.title = title;
    this.urgent = urgent;
    this.done = done;
    this.assignee = assignee;

  }

  public Todo(String title, boolean urgent, boolean done) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
  }

  public Long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public Long getAssigneeIdForEditing(){
    return assigneeId;
  }

  public Long getAssigneeId() {
    if (assignee == null) {
      return 0L;   //L -longként értelmezi a nullát
    } else {
      return assignee.getId();
    }
  }


  public String getAssigneeName() {
    if (assignee == null) {
      return "";
    } else {
      return assignee.getName();
    }
  }

  public void setAssigneeId(Long assigneeId) {
    this.assigneeId = assigneeId;
  }
}
