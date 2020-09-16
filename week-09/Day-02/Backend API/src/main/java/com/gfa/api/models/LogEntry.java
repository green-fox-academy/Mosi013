package com.gfa.api.models;

import java.util.ArrayList;
import java.util.List;

public class LogEntry {

  private List<Log> entries;
  private int entryCount;

  public LogEntry(List<Log> allLogs) {
    this.entries = new ArrayList<>();
  }


  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public int getEntryCount() {
    return entryCount;
  }

  public void setEntryCount(int entryCount) {
    this.entryCount = entryCount;
  }
}
