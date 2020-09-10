package com.gfa.mysql;

import com.gfa.mysql.models.Assignee;
import com.gfa.mysql.models.Todo;
import com.gfa.mysql.repositories.AssigneeRepository;
import com.gfa.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication  implements CommandLineRunner {

  private final TodoRepository todoRepository;
  private final AssigneeRepository assigneeRepository;

  @Autowired
  public MysqlApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository){
    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(MysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("daily task", false, false));
    todoRepository.save(new Todo("make the beds", true, true));
    todoRepository.save(new Todo("do the washing up", true, false));
    todoRepository.save(new Todo("tidy up", false, false));
    assigneeRepository.save(new Assignee("sanyi", "béla@sanyi.hu"));
  }
}
