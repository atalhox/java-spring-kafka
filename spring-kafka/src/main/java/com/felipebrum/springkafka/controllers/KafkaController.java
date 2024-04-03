package com.felipebrum.springkafka.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipebrum.springkafka.services.ProducerService;
import com.felipebrum.springkafka.models.ResponseModel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private ProducerService service;

    public KafkaController(ProducerService service) {
        this.service = service;
    }

    @PostMapping("/{topic}")
    public ResponseModel sendMessage(@PathVariable String topic, @RequestBody String message) {
        service.sendMessage(topic, message);
        return new ResponseModel("Sucess");
    }

}
