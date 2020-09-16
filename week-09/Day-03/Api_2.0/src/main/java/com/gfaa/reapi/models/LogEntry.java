package com.gfaa.reapi.models;

import java.util.ArrayList;
import java.util.List;

public class LogEntry {

  private int entryCount;
  private List<Log> entries;

  public LogEntry(int entryCount) {
    this.entryCount = entryCount;
    this.entries = new ArrayList<>();
  }

  public LogEntry() {
  }

  public int getEntryCount() {
    return entryCount;
  }

  public void setEntryCount(int entryCount) {
    this.entryCount = entryCount;
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }
}