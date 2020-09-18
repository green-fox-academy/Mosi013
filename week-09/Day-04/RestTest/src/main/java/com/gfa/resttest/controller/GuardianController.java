package com.gfa.resttest.controller;

import com.gfa.resttest.errors.DivedZeroMessage;
import com.gfa.resttest.errors.DivedZeroMessageError;
import com.gfa.resttest.errors.MessageMissingError;
import com.gfa.resttest.errors.ParameterIsMissingError;
import com.gfa.resttest.models.Groot;
import com.gfa.resttest.models.YoundusArrow;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity translateToGroot(@RequestParam(required = false) String message) {
    if (message == null) {
      return ResponseEntity.badRequest().body(new MessageMissingError());
    }
    return ResponseEntity.ok(new Groot(message));
  }

  @GetMapping("/yondu")
  public ResponseEntity calculateYondusArrowsSpeed(@RequestParam(required = false) Float distance,
                                                   @RequestParam(required = false) Float time) {
    if (distance == null || time == null) {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
    if (time == 0) {
      return ResponseEntity.badRequest().body(new DivedZeroMessageError());
    }
    return ResponseEntity.ok(new YoundusArrow(distance, time));
  }
}
