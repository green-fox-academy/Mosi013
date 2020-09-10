package com.gfa.databaseintegration;

import com.gfa.databaseintegration.models.Todo;
import com.gfa.databaseintegration.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseintegrationApplication implements CommandLineRunner {

  private final TodoRepository todoRepository;

  @Autowired
  public DatabaseintegrationApplication(TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(DatabaseintegrationApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));  }
}
