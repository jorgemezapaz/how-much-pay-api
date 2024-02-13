package com.jmezapaz.howmuchpayapi.controller;

import com.jmezapaz.howmuchpayapi.dto.TestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/services")
public class ServiceController {

  private static Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);

  @GetMapping
  public ResponseEntity<List<String>> services(){
    List<String> list = new ArrayList<>();
    list.add("Netflix");
    list.add("Youtube");
    list.add("Spotify");
    list.add("Amazon Prime");
    LOGGER.info("--ServiceApi::services services:{}", list);
    return new ResponseEntity<>(list, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<TestDto> save(@RequestBody TestDto request){
    LOGGER.info("--ServiceApi::save request:{}", request);
    return new ResponseEntity<>(request, HttpStatus.OK);
  }
}
