package org.sidok.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viber")
public class ViberWebhookController {

    @PostMapping("/webhook")
    public ResponseEntity<Void> webhook(@RequestBody String body) {
        System.out.println(body);
        return ResponseEntity.ok().build();
    }

}
