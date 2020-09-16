package com.gfaa.reapi.errors;

public class ArrayError {

  private String error;

  public ArrayError() {
    this.error = "Please provide what to do with the numbers!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}