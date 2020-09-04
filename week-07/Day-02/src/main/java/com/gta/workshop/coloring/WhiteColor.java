package com.gta.workshop.coloring;

import com.gta.workshop.helloword.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class WhiteColor implements MyColor{

  private final Printer printer;

  @Autowired
  public WhiteColor(Printer printer){
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("It is white in color...");
  }
}