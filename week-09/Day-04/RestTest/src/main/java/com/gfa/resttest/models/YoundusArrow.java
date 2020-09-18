package com.gfa.resttest.models;

public class YoundusArrow {
  private float distance;
  private float time;
  private float speed;

  public YoundusArrow(float distance, float time) {
    this.distance = distance;
    this.time = time;
    this.speed= this.distance / this.time;
  }

  public float getDistance() {
    return distance;
  }

  public void setDistance(float distance) {
    this.distance = distance;
  }

  public float getTime() {
    return time;
  }

  public void setTime(float time) {
    this.time = time;
  }

  public float getSpeed() {
    return speed;
  }

  public void setSpeed(float speed) {
    this.speed = speed;
  }
}
