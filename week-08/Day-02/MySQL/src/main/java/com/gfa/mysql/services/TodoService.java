package com.gfa.mysql.services;

import com.gfa.mysql.models.Todo;
import com.gfa.mysql.repositories.TodoRepository;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class TodoService {

  private final TodoRepository todoRepository;

  @Autowired
  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }


  public Iterable<Todo> listAllTodos() {
    return todoRepository.findAll();
  }

  public void addNewTodo(Todo todo) {
    todoRepository.save(todo);
  }

  public void deleteTodoById(Long id) {
    Optional<Todo> selectedTodo = todoRepository.findById(id);
    selectedTodo.ifPresent(todoRepository::delete);
  }


  public Todo getTodoById(Long id) {
    Optional<Todo> selectTodo = todoRepository.findById(id);
    return selectTodo.get();
  }

  public void updateTodo(Todo editTodo) {
    todoRepository.save(editTodo);
  }
}
