package com.kafka.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class KafkaProducesController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/produces/{message}")
    public void producer(@PathVariable("message") String message) {
        this.kafkaTemplate.send("ecommerce.cliente2", message);
    }
}