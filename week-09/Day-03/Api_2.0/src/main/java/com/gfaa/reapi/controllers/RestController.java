package com.gfaa.reapi.controllers;

import com.gfaa.reapi.errors.ArrayError;
import com.gfaa.reapi.errors.DoUntilError;
import com.gfaa.reapi.errors.ShitTextError;
import com.gfaa.reapi.errors.TitleAndNameMissingError;
import com.gfaa.reapi.errors.TitleMissingError;
import com.gfaa.reapi.models.Appenda;
import com.gfaa.reapi.models.ArrayHandler;
import com.gfaa.reapi.models.ArrayHandlerDouble;
import com.gfaa.reapi.models.ArrayHandlerMult;
import com.gfaa.reapi.models.ArrayHandlerSum;
import com.gfaa.reapi.models.DoUntilFactor;
import com.gfaa.reapi.models.DoUntilSum;
import com.gfaa.reapi.models.Doubling;
import com.gfaa.reapi.models.Greeter;
import com.gfaa.reapi.models.Limit;
import com.gfaa.reapi.models.ShitText;
import com.gfaa.reapi.services.LogService;
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

private LogService logService;

@Autowired
  public RestController(LogService logService) {
    this.logService = logService;
  }

  @GetMapping("/doubling")
  public ResponseEntity doubleNumber(@RequestParam(required = false) Integer input) {
    if (input != null) {
      logService.createNewLog("/doubling", "value=" + input);
      Doubling doubling = new Doubling(input);
      return ResponseEntity.ok().body(doubling);
    } else {
      return ResponseEntity.ok().body(new Error("Please provide an input!"));
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity<?> greet(@RequestParam(required = false) String name,
                                 @RequestParam(required = false) String title) {
    if (name == null && title == null) {
      return ResponseEntity.badRequest().body(new TitleAndNameMissingError());
    } else if (name == null) {
      return ResponseEntity.badRequest().body(new NameMissingError());
    } else if (title == null) {
      return ResponseEntity.badRequest().body(new TitleMissingError());
    } else {
      logService.createNewLog("/greeter", "?name=" + name + "&title=" + title);
      return ResponseEntity.ok().body(new Greeter(name, title));
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity appendA(@PathVariable(required = false) String appendable) {
    if (appendable == null) {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    } else {
      logService.createNewLog("/appenda", "appendable=" + appendable);
      return ResponseEntity.ok().body(new Appenda(appendable));
    }
  }

  @PostMapping("/dountil/{operation}")
  public ResponseEntity doUntil(@RequestBody Limit limit,
                                @PathVariable String operation) {
    if (operation.equals("sum")) {
      logService.createNewLog("/dountil/sum", "until=" + limit.getUntil());
      return ResponseEntity.ok().body(new DoUntilSum(limit.getUntil()));

    } else if (operation.equals("factor")) {
      logService.createNewLog("/dountil/factor", "until=" + limit.getUntil());
      return ResponseEntity.ok().body(new DoUntilFactor(limit.getUntil()));

    } else {
      return new ResponseEntity<>(new DoUntilError(), HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity arrays(@RequestBody ArrayHandler array) {
    if (array.getWhat().equals("sum")) {
      logService.createNewLog("/arrays/" + array.getWhat(), array.getNumbers().toString());
      return ResponseEntity.ok().body(new ArrayHandlerSum(array.getNumbers()));
    } else if (array.getWhat().equals("multiply")) {
      logService.createNewLog("/arrays/" + array.getWhat(), array.getNumbers().toString());
      return ResponseEntity.ok().body(new ArrayHandlerMult(array.getNumbers()));
    } else if (array.getWhat().equals("double")) {
      logService.createNewLog("/arrays/" + array.getWhat(), array.getNumbers().toString());
      return ResponseEntity.ok().body(new ArrayHandlerDouble(array.getNumbers()));
    } else {
      return ResponseEntity.ok().body(new ArrayError());
    }
  }

  @GetMapping("/log")
  public ResponseEntity getAllLogs() {
    return ResponseEntity.ok().body(logService.getAllLogs());
  }

  @PostMapping("/sith")
  public ResponseEntity sithSentence (@RequestBody ShitText shitText){
    if (shitText.getSithtext() == null) {
      return ResponseEntity.badRequest().body(new ShitTextError());
    }

  }
}