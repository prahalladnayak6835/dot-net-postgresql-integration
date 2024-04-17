package com.kotlinkafka.projectkotlinkafka

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

// Annotates the class as a Spring component, allowing it to be managed by Spring's application context
@Component
class KafkaConsumer {

    // Define a method to consume messages from the 'user-topic' Kafka topic
    @KafkaListener(topics = ["user-topic"], groupId = "group_id")
    fun consume(record: ConsumerRecord<String, String>) {
        try {
            // Print the received message value
            println("Received message: ${record.value()}")
            // Process the message here (e.g., save to a database, send a notification, etc.)
        } catch (e: Exception) {
            // Handle any exceptions that occur during message processing
            println("Error processing message: ${e.message}")
            // Optionally, you can log the exception or perform other error handling actions
        }
    }
}