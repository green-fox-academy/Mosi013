package com.gfa.resttest.errors;

public class ParameterIsMissingError {
  private String error;

  public ParameterIsMissingError() {
    this.error = "Parameter is missing";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
