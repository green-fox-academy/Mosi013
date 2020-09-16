package com.gfaa.reapi.errors;

public class TitleMissingError {

  private String error;

  public TitleMissingError() {
    this.error = "Please provide a title!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}