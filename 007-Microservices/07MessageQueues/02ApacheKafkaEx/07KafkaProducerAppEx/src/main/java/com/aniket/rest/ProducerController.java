package com.aniket.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aniket.service.ProducerService;

@RestController
public class ProducerController {

    private ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {

        producerService.sendMessage(message);

        return "Message sent successfully";
    }
}
