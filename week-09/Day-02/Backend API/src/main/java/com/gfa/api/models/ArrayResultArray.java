package com.gfa.api.models;

public class ArrayResultArray {
  private int[] result;

  public ArrayResultArray() {
  }

  public ArrayResultArray(int[] result) {
    this.result = result;
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }

  public void doubledNums(What what) {
    int[] resultArray = new int[what.getNumbers().length];
    for (int i = 0; i < what.getNumbers().length; i++) {
      resultArray[i] = what.getNumbers()[i] * 2;
    }
    this.result= resultArray;
  }
}
