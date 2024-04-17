package com.kotlinkafka.projectkotlinkafka

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import org.slf4j.LoggerFactory

// Annotates the class as a Spring component, allowing it to be managed by Spring's application context
@Component
class KafkaConsumer {
    private val logger = LoggerFactory.getLogger(KafkaConsumer::class.java)
    // Define a method to consume messages from the 'user-topic' Kafka topic
    @KafkaListener(topics = ["user-topic"], groupId = "group_id")
    fun consume(record: ConsumerRecord<String, String>) {
        try {
            // Print the received message value
            logger.info("Received message: {}", record.value())

        } catch (e: Exception) {
            // Handle any exceptions that occur during message processing
            logger.error("Error processing message: {}", e.message)

        }
    }
}