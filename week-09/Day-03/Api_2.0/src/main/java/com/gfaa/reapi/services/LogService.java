package com.gfaa.reapi.services;

import com.gfaa.reapi.models.Log;
import com.gfaa.reapi.models.LogEntry;
import com.gfaa.reapi.repositories.LogRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

  private final LogRepository logRepository;

  @Autowired
  public LogService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }


  public void createNewLog(String endpoint, String data) {
    logRepository.save(new Log(endpoint, data));
  }

  public LogEntry getAllLogs() {
    LogEntry logEntry = new LogEntry();
    logEntry.setEntries(logRepository.findAll());
    logEntry.setEntryCount(logEntry.getEntries().size());
    return logEntry;
  }
}
