package com.gfaa.reapi.models;

public class Appenda {

  private String appended;

  public Appenda(String toAppend) {
    this.appended = toAppend + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
