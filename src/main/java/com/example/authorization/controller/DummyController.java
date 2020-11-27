package com.example.authorization.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dummy")
public class DummyController {
    @GetMapping
    private ResponseEntity<String> dummy() {
        return ResponseEntity.ok("Everyone can see this page without authentication process.");
    }
}
