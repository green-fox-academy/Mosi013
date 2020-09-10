package com.gfa.todo.services;

import com.gfa.todo.models.ToDo;
import com.gfa.todo.repositories.ToDoRepositorie;
import com.sun.tools.javac.comp.Todo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

  private final ToDoRepositorie toDoRepositorie;

  @Autowired
  public ToDoService(ToDoRepositorie toDoRepositorie){
    this.toDoRepositorie = toDoRepositorie;
  }

  public List<ToDo> getToDosList() {
    return toDoRepositorie.showAllToDos();
  }

  public void deleteProductById(long toDoId) {
    toDoRepositorie.deleteById(toDoId);
  }

  public void addToDo(ToDo newtodo) {
    newtodo.setId(toDoRepositorie.showAllToDos().size());
    toDoRepositorie.save(newtodo);
  }

  public ToDo getTodoById(long todoId) {
   return toDoRepositorie.findById(todoId);
  }

  public void editTodo(ToDo todo) {
    toDoRepositorie.edit(todo);
  }
}
