package com.jmezapaz.howmuchpayapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HealthController {

  @GetMapping("/health")
  public ResponseEntity<Map<String,String>> healthCheck(){
    return new ResponseEntity<>(Map.of("status","up"), HttpStatus.OK);
  }
}
