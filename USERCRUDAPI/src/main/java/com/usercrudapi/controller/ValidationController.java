package com.usercrudapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usercrudapi.model.InputData;

@RestController
@RequestMapping("/api")
public class ValidationController {

    @PostMapping("/validate")
    public ResponseEntity<String> validateInput(@RequestBody InputData inputData) {
        // Check if name is not null and not empty after trimming
        if (inputData.getName() != null && !inputData.getName().trim().isEmpty()) {
            return ResponseEntity.ok("Success");
        } else {
            return ResponseEntity.badRequest().body("Invalid");
        }
    }
}