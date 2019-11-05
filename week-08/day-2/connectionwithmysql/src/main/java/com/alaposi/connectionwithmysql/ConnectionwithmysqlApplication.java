package com.alaposi.connectionwithmysql;

import com.alaposi.connectionwithmysql.models.Todo;
import com.alaposi.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner {

  private TodoRepository repository;

  @Autowired
  public ConnectionwithmysqlApplication(TodoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectionwithmysqlApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
    repository.save(new Todo("Start the day"));
    repository.save(new Todo("Finish H2 workshop1"));
    repository.save(new Todo("Finish JPA workshop2"));
    repository.save(new Todo("Create a CRUD project"));
    repository.save(new Todo("make the beds", false, false));
    repository.save(new Todo("do the washing up", true, false));
    repository.save(new Todo("clean the bathroom and the kitchen", true, false));
    repository.save(new Todo("wash the floors", true, true));
    repository.save(new Todo("tidy up", false, false));
  }
}
