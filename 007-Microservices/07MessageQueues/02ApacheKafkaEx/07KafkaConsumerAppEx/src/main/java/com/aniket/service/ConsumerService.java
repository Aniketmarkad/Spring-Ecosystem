package com.aniket.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void readMessage(String message) {

        System.out.println("Message received by Consumer: " + message);
    }
}