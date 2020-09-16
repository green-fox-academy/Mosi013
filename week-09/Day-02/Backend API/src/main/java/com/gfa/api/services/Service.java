package com.gfa.api.services;

import com.gfa.api.models.ArrayResultArray;
import com.gfa.api.models.ArrayResultInt;
import com.gfa.api.models.Log;
import com.gfa.api.models.What;
import com.gfa.api.repositories.LogRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

  private LogRepository logRepository;

  @Autowired
  public Service(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  public ArrayResultInt sumOrMultiply(What what){
    ArrayResultInt arrayResultInt = new ArrayResultInt();
    if (what.getWhat().equals("sum")){
      arrayResultInt.sum(what);
    } else if (what.getWhat().equals("multiply")){
      arrayResultInt.multiply(what);
    }
    return arrayResultInt;
  }

  public ArrayResultArray doubled(What what){
    ArrayResultArray arrayResultArray = new ArrayResultArray();
    if (what.getWhat().equals("double")){
      arrayResultArray.doubledNums(what);
    }
    return arrayResultArray;
  }

  public void createNewLog(String endpoint, String data){
    logRepository.save(new Log(endpoint, data));
  }

  public List<Log> getAllLogs(){
    return logRepository.findAll();
  }
}
