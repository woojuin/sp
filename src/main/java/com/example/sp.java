package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sp {
  @RequestMapping("/")
  public String home() {
    return ("SP OPENSHIFT");
  }
}