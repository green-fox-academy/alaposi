package com.alaposi.todoappandassignees.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  //automatikusan növeli az értéket
  private Long id;
  @Column(name = "action")
  private String title;
  private boolean urgent;
  private boolean done;
  private Date creationDate;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date dueDate;
  @Transient
  private Long assigneeId;

  @ManyToOne  //ide nem kell semmi, mert a oneToMany-nél  meg van adva.
  private Assignee assignee;


  public Todo(long id, String title, boolean urgent, boolean done, Assignee assignee, Date dueDate) {
    this(title, urgent, done);
    this.id = id;
    this.assignee = assignee;
    this.dueDate = dueDate;
  }

  public Todo(String title, boolean urgent, boolean done) {
    this(title);
    this.urgent = urgent;
    this.done = done;
  }

  public Todo() {
    this.creationDate = new Date();
  }

  public Todo(String title) {
    this();
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

  public Long getAssigneeIdForEditing() {
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

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }
}
