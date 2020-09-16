package com.gfaa.reapi.models;

public class DoUntilFactor {
  private int result;

  public DoUntilFactor(int limit) {
    this.result = 1;

    for (int i = 1; i <= limit; i++) {
      this.result *= i;
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}