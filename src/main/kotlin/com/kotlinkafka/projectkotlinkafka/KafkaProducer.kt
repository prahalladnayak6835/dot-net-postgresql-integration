package com.kotlinkafka.projectkotlinkafka

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProducer(private val kafkaTemplate: KafkaTemplate<String, String>) {

    // Method to send a message to the specified topic
    fun sendMessage(topic: String, message: String) {
        try {
            // Send the message to the Kafka topic using the KafkaTemplate
            kafkaTemplate.send(topic, message)
            // Optionally, you can log a success message or perform other actions after sending the message
            println("Message sent successfully to topic '$topic'")
        } catch (e: Exception) {
            // Handle any exceptions that occur during message sending
            println("Error sending message to topic '$topic': ${e.message}")
            // Optionally, you can log the exception or perform other error handling actions
        }
    }
}
