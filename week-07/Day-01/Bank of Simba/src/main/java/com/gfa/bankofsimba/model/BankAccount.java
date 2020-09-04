package com.gfa.bankofsimba.model;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;
  private boolean isKing;
  private boolean isGood;


  public BankAccount(String name, int balance, String animalType, boolean isKing, boolean isGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGood = isGood;
  }

  public BankAccount(BankAccount bankAccount) {
  }

  public boolean getIsGood() {
    return isGood;
  }

  public boolean getIsKing() {
    return isKing;
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }
}


