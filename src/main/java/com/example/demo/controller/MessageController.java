package com.example.demo.controller;

import com.example.demo.entity.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Message> postMessage(@RequestHeader("authentication") String authentication, @RequestBody @Validated Message message) {
        if (authentication == null || !authentication.equals("devmind-api-key")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
    }
}
