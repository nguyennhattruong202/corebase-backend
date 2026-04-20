package com.truong.corebase.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
@Tag(name = "Health Rest API", description = "Health Rest API description")
@Slf4j
public class HealthController {
  @GetMapping("/health")
  public ResponseEntity<Map<String, String>> health() {
    return ResponseEntity.ok(Map.of(
            "status", "OK",
            "message", "Backend is running!"
    ));
  }

  @GetMapping("/hello")
  public ResponseEntity<Map<String, String>> hello() {
    return ResponseEntity.ok(Map.of(
            "message", "Hello from Spring Boot on Render!"
    ));
  }
}
