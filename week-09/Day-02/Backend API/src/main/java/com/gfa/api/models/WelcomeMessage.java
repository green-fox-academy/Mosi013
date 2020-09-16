package com.gfa.api.models;

public class WelcomeMessage {
  private String name;
  private String title;
  private String welcomemessage;

  public WelcomeMessage(String name, String title) {
    this.welcomemessage = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWelcome_message() {
    return welcomemessage;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcomemessage = welcome_message;
  }
}
