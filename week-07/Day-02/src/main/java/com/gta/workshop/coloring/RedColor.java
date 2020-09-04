package com.gta.workshop.coloring;

import com.gta.workshop.helloword.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("redColor")
public class RedColor implements MyColor{

  private Printer printer;

  @Autowired
  public RedColor(Printer printer){
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("It is red in color...");
  }
}
