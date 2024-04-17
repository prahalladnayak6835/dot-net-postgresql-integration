package com.kotlinkafka.projectkotlinkafka

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaConsumer {
    @KafkaListener(topics = ["user-topic"], groupId = "group_id")
    fun consume(record: ConsumerRecord<String, String>) {
        println("Received message: ${record.value()}")
    }
}