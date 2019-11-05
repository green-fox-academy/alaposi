package com.alaposi.listingtodos;

import com.alaposi.listingtodos.models.Todo;
import com.alaposi.listingtodos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {

  private TodoRepository repository;

  @Autowired
  public ListingtodosApplication(TodoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ListingtodosApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Todo("Start the day"));
    repository.save(new Todo("Finish H2 workshop1"));
    repository.save(new Todo("Finish JPA workshop2"));
    repository.save(new Todo("Create a CRUD project"));
  }
}
