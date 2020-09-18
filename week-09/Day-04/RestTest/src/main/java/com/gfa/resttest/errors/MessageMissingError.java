package com.gfa.resttest.errors;

public class MessageMissingError {

  private String error;

  public MessageMissingError() {
    this.error = "I am Groooot!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
