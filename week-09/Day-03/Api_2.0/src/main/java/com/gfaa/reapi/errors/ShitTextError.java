package com.gfaa.reapi.errors;

public class ShitTextError {

  private String error;

  public ShitTextError() {
    this.error = "Feed me some text you have to, padawan " +
        "young you are. Hmmm.";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
