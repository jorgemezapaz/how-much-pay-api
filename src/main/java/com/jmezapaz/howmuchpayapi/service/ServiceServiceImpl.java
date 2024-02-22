package com.jmezapaz.howmuchpayapi.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jmezapaz.howmuchpayapi.dto.ServiceDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService{
  private static final Logger LOGGER = LoggerFactory.getLogger(ServiceServiceImpl.class);
  @Override
  public List<ServiceDTO> getAllS() {
    try{
      String s = new String(Files.readAllBytes(Paths.get("src/main/resources/data/data.json")));
      ObjectMapper mapper = new ObjectMapper();
      List<ServiceDTO> services = mapper.readValue(s, new TypeReference<List<ServiceDTO>>() {});
      LOGGER.info("--ServiceServiceImpl::getAllS services: {}", services);
      return services;
    } catch (IOException e){
      LOGGER.error("--ServiceServiceImpl::getAllS services: {}", e.getMessage());
    }
    return null;
  }
}
