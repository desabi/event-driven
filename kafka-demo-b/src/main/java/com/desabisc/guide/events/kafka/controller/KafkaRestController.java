package com.desabisc.guide.events.kafka.controller;

import com.desabisc.guide.events.kafka.producer.MessageProducer;
import com.desabisc.guide.events.kafka.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaRestController {
  @Autowired
  private MessageProducer messageProducer;

  @Autowired
  private MessageRepository messageRepository;

  // Send message to Kafka
  @GetMapping("/send")
  public String sendMessage(@RequestParam("message") String message) {
    messageProducer.sendMessage(message);
    return " ' " + message + " ' Sent successfully";
  }

  // read all messages
  @GetMapping("getAll")
  public String getAllMessages() {
    return messageRepository.getAllMessages();
  }
}
