package com.felipebrum.springkafka.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    // Topic-name and message
    private KafkaTemplate<String, String> kafkaTemplate;

    public ProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    /**
     * Sends a message to a specified Kafka topic.
     *
     * @param  topic   the topic to which the message will be sent
     * @param  message the message to be sent
     */
    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }


}
