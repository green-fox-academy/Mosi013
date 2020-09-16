package com.gfa.api.models;

public class DoUntil {
  private Integer until;
  private Integer result;

  public DoUntil() {
  }

  public DoUntil(Integer until) {
    this.until = until;
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public void setResultSum() {
    this.result = 0;
    for (int i = 0; i <= this.until; i++) {
      this.result += i;
    }
  }

  public void setResultFaktor() {
    this.result = 1;
    for (int i = 1; i <= this.until; i++) {
      this.result *= i;
    }
  }

  public void setResultWithAction(String action) {
    if (action.equals("sum")) {
      this.setResultSum();
    } else if (action.equals("factor")) {
      this.setResultFaktor();
    }
  }
}

