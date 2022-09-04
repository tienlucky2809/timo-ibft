package com.timo.ibft.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MainController {

    @PostMapping("/api/v1.0/timo/ibft-i")
    public ResponseEntity outboundRequestController(@RequestBody String iso8583Model) {
        log.info("Hello");
        return ResponseEntity.ok().build();
    }
}
