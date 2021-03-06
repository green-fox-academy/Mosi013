package com.gta.workshop;

import com.gta.workshop.coloring.MyColor;
import com.gta.workshop.helloword.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkshopApplication implements CommandLineRunner {

  private final Printer printer;
  private final MyColor myColor;

  @Autowired
  public WorkshopApplication(Printer printer, MyColor myColor){
    this.printer = printer;
    this.myColor = myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(WorkshopApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    myColor.printColor();
  }
}
