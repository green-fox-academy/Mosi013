package com.gfa.api.controllers;

import com.gfa.api.models.AppendA;
import com.gfa.api.models.ArrayResultArray;
import com.gfa.api.models.ArrayResultInt;
import com.gfa.api.models.DoUntil;
import com.gfa.api.models.Doubling;
import com.gfa.api.models.ErrorZ;
import com.gfa.api.models.Log;
import com.gfa.api.models.LogEntry;
import com.gfa.api.models.WelcomeMessage;
import com.gfa.api.models.What;
import com.gfa.api.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  private Service service;

  @Autowired
  public RestController(Service service) {
    this.service = service;
  }

  @GetMapping("/doubling")
  public ResponseEntity getDoublingNumber(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return ResponseEntity.ok(new ErrorZ("Please provide an input!"));
    } else {
      Doubling doubling = new Doubling(input);
      service.createNewLog("/doubling", "?input=" + input);
      return ResponseEntity.status(HttpStatus.OK).body(doubling);
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity<?> getPersonWithNameAndTitle(@RequestParam(required = false) String name,
                                                     @RequestParam(required = false) String title) {
    if (name == null && title == null) {
      return ResponseEntity.badRequest().body(new ErrorZ("Please provide a name and a title!"));
    } else if (name == null) {
      return ResponseEntity.badRequest().body(new ErrorZ("Please provide a name!"));
    } else if (title == null) {
      return ResponseEntity.badRequest().body(new ErrorZ("Please provide a title!"));
    } else {
      WelcomeMessage welcome = new WelcomeMessage(name, title);
      service.createNewLog("/greeter", "?name=" + name + "&title=" + title);
      return ResponseEntity.status(HttpStatus.OK).body(welcome);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<AppendA> getWordWithAppendA(@PathVariable String appendable) {
    AppendA appendA = new AppendA(appendable);
    service.createNewLog("/appenda", "/appenda/" + appendable);
    return ResponseEntity.ok(appendA);
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> getDoUntilWithAction(@PathVariable String action,
                                                @RequestBody DoUntil doUntil) {
    if (doUntil.getUntil() == null) {
      return ResponseEntity.ok(new Error("Please provide a number!"));
    } else {
      //service.createNewLog("/dountil", "action= " + doUntil.setResultWithAction(action));
      doUntil.setResultWithAction(action);
      return ResponseEntity.ok(doUntil);
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity getArrayActionWithResult(@RequestBody What what, ArrayResultInt arrayResultInt, ArrayResultArray arrayResultArray) {
    if (what.getWhat().equals("sum") || what.getWhat().equals("multiply")) {
      service.createNewLog("/arrays/" + what.getWhat(), service.sumOrMultiply(what).toString());
      return ResponseEntity.ok().body(service.sumOrMultiply(what));
    } else if (what.getWhat().equals("double")) {
      service.createNewLog("/arrays/" + what.getWhat(), service.doubled(what).toString());
      return ResponseEntity.ok().body(service.doubled(what));
    } else if (what.getNumbers() == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a numbers!"));
    } else if (what.getWhat() == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide what to do with numbers!"));
    } else {
      return ResponseEntity.badRequest().body(new Error("Please provide correct parameters!"));
    }
  }

  @GetMapping("/log")
  public ResponseEntity getLog() {
    return ResponseEntity.ok().body(new LogEntry(service.getAllLogs()));
  }

}
