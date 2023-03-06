package com.atc.trafficcontrol.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerListener {

    @Value("${topic.name.consumer")
    private String topicName;

    @KafkaListener(topics = "${topic.name-consumer}", groupId = "${kafka.group.id}")
    public void listen(ConsumerRecord<String, String> payload) {
        log.info("Message received. MessageID : {} Message: {} Date : {}",
                payload.key(), payload.headers(), payload.partition(), payload.value());
    }
}
