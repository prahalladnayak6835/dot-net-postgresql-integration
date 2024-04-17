# Kotlin Kafka Project

This is a simple project demonstrating how to use Apache Kafka with Kotlin and Spring Boot.

## Project Structure

- **KafkaConsumer:** Annotated with `@KafkaListener` to consume messages from the 'user-topic'.
- **KafkaProducer:** Sends messages to the 'user-topic' using `KafkaTemplate`.
- **Main Application:** Entry point of the application.

## Dependencies

- Spring Boot
- Spring Kafka
- Apache Kafka

## Setup

1. Install Apache Kafka and start the Kafka server.
2. Configure the Kafka server address and other properties in `application.properties`.
3. Run the application.

## Usage

1. Run the application.
2. Send messages to the 'user-topic' using a Kafka producer tool.
3. Check the logs to see the messages being consumed by the Kafka consumer.

## Configuration

- `spring.kafka.bootstrap-servers`: Kafka server address.
- `spring.application.name`: Application name.

## Logging

- SLF4J is used for logging.
- Logs can be found in the console or log files.

## Error Handling

- Exceptions during message processing or sending are logged.

## Contributing

Feel free to contribute to this project by forking the repository and submitting a pull request.

