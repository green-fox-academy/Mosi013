package com.gfa.todo.repositories;

import com.gfa.todo.models.ToDo;
import com.sun.tools.javac.comp.Todo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ToDoRepositorie {

  private final List<ToDo> toDoList;

  @Autowired
  public ToDoRepositorie(){
    toDoList = new ArrayList<>();
    toDoList.add(new ToDo("Buy milk", false, true));
    toDoList.add(new ToDo("Watch homework", true, true));
    toDoList.add(new ToDo("Save the Word", false, false));
  }

  public List<ToDo> showAllToDos(){
    return toDoList;
  }

  public void deleteById(long toDoId) {
    int index = (int) getIndex(toDoId);
    toDoList.remove(index);
  }

  public void save(ToDo newtodo) {
    toDoList.add(newtodo);
  }

  public ToDo findById(long todoId) {
    return  toDoList.get((int) getIndex(todoId));
  }

  public void edit(ToDo todo) {
    toDoList.set((int) getIndex(todo.getId()), todo);
  }



  private long getIndex(long productId) {
    int index = 0;

    for (int i = 0; i < toDoList.size(); i++) {

      if (toDoList.get(i).getId() == productId){
        index = i;
        break;
      }
    }
    return index;
  }


}
