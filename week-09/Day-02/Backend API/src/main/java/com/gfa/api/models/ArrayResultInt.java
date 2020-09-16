package com.gfa.api.models;

public class ArrayResultInt {
  private int result;

  public ArrayResultInt() {
  }

  public ArrayResultInt(int result) {
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void sum(What what) {
    int result = 0;
    for (int num : what.getNumbers()) {
      result = result + num;
    }
    this.result = result;
  }

  public void multiply(What what){
    int result = 1;
    for (int num : what.getNumbers()){
      result = result * num;
    }
    this.result = result;
  }
}
