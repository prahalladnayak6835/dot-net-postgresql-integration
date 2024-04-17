package com.kotlinkafka.projectkotlinkafka

import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProducer(private val kafkaTemplate: KafkaTemplate<String, String>) {
    private val logger = LoggerFactory.getLogger(KafkaProducer::class.java)

    // Method to send a message to the specified topic
    fun sendMessage(topic: String, message: String) {
        try {
            // Send the message to the Kafka topic using the KafkaTemplate
            kafkaTemplate.send(topic, message)

            logger.info("Message sent successfully to topic '{}'", topic)
        } catch (e: Exception) {
            // Handle any exceptions that occur during message sending
            logger.error("Error sending message to topic '{}': {}", topic, e.message)


        }
    }
}
