package com.gfaa.reapi.models;

public class Greeter {

  private String welcomeMessage;

  public Greeter (String name, String title) {

    this.welcomeMessage = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getWelcomeMessage() {
    return welcomeMessage;
  }

  public void setWelcomeMessage(String welcomeMessage) {
    this.welcomeMessage = welcomeMessage;
  }
}