package com.alaposi.todoappandassignees;

import com.alaposi.todoappandassignees.models.Assignee;
import com.alaposi.todoappandassignees.models.Todo;
import com.alaposi.todoappandassignees.repositories.AssigneeRepository;
import com.alaposi.todoappandassignees.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappandassigneesApplication implements CommandLineRunner {

  private TodoRepository todoRepository;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public TodoappandassigneesApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodoappandassigneesApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Start the day"));
//    todoRepository.save(new Todo("Finish H2 workshop1"));
//    todoRepository.save(new Todo("Finish JPA workshop2"));
//    todoRepository.save(new Todo("Create a CRUD project"));
//    todoRepository.save(new Todo("make the beds", false, true));
//    todoRepository.save(new Todo("do the washing up", true, false));
//    todoRepository.save(new Todo("clean the bathroom and the kitchen", true, false));
//    todoRepository.save(new Todo("wash the floors", true, true));
//    todoRepository.save(new Todo("tidy up", false, false));

//    assigneeRepository.save(new Assignee("Heni", "havasi.heni0@gmail.com"));
//    assigneeRepository.save(new Assignee("Ági", "agnes.laposi@gmail.com"));

    Assignee henriett = new Assignee("Henriett", "havasi.heni@gmail.com");
    Assignee agnes = new Assignee("Agnes", "agnes.laposi@gmail.com");
    Todo arrangeWedding = new Todo("arrange the wedding", true, false);
    Todo learnJava = new Todo("learn Java");

    henriett.addTodo(arrangeWedding);
    agnes.addTodo(learnJava);

//    assigneeRepository.save(henriett);
//    assigneeRepository.save(agnes);



  }
}
