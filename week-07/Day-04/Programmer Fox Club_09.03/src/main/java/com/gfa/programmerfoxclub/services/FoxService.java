package com.gfa.programmerfoxclub.services;

import com.gfa.programmerfoxclub.models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxService {

  private List<Fox> foxList;

  public FoxService() {
    this.foxList = new ArrayList<>();
  }

  public void addFox(Fox fox){
    this.foxList.add(fox);

  }
}
