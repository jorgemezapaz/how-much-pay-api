package com.jmezapaz.howmuchpayapi.controller;

import com.jmezapaz.howmuchpayapi.dto.ServiceDTO;
import com.jmezapaz.howmuchpayapi.dto.TestDto;
import com.jmezapaz.howmuchpayapi.service.ServiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/services")
public class ServiceController {

  private static final Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);

  private final ServiceService service;

  public ServiceController(ServiceService service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<List<ServiceDTO>> services() {
    LOGGER.info("--ServiceApi::services services");
    return new ResponseEntity<>(service.getAllS(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<TestDto> save(@RequestBody TestDto request){
    LOGGER.info("--ServiceApi::save request:{}", request);
    return new ResponseEntity<>(request, HttpStatus.OK);
  }
}
