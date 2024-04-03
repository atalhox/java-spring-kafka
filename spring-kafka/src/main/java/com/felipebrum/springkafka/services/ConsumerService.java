package com.felipebrum.springkafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ConsumerService {


    private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @Autowired
    public ConsumerService() {
    }

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void listen(String message) {
        logger.info(String.format("My-topic - %s", message));
    }

}
