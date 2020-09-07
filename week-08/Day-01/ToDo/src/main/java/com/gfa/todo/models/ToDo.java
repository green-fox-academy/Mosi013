package com.gfa.todo.models;

public class ToDo {
  private long id;
  private String action;
  private boolean isDone;
  private boolean isUrgent;

  private static int idCounter = 0;

  public ToDo(String action, boolean isDone, boolean isUrgent) {
    this.id = ++idCounter;
    this.action = action;
    this.isDone = isDone;
    this.isUrgent = isUrgent;
  }

  public ToDo() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public boolean getIsDone() {
    return isDone;
  }

  public void setIsDone(boolean done) {
    isDone = done;
  }

  public boolean getIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(boolean urgent) {
    isUrgent = urgent;
  }
}
