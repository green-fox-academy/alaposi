package com.alaposi.connectionwithmysql.models;

import javax.persistence.*;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  //automatikusan növeli az értéket
  private long id;
  @Column(name = "action")
  private String title;
  private boolean urgent = false;
  private boolean done = false;


  public Todo(long id, String title, boolean urgent, boolean done) {
    this.id = id;
    this.title = title;
    this.urgent = urgent;
    this.done = done;
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

  public long getId() {
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
}
