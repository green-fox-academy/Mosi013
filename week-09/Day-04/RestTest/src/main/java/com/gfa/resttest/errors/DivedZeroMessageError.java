package com.gfa.resttest.errors;

public class DivedZeroMessageError {
  private String error;

  public DivedZeroMessageError() {
    this.error = "cant divide with zero";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
