package com.desabisc.guide.events.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * source: https://dev.to/neeraj1997dev/work-with-apache-kafka-in-spring-boot-1jg5
 * Start zookeeper: .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
 * Start kafka: .\bin\windows\kafka-server-start.bat .\config\server.properties
 * Postman: http://localhost:9090/send?message=practicingkafka
 */
@SpringBootApplication
@EnableKafka
public class KafkaDemoBApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoBApplication.class, args);
	}

}
