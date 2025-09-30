package com.desabi.guide.kafka.producer;

import com.desabi.guide.kafka.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaAvroProducer {

  @Autowired
  private KafkaTemplate<String, Employee> kafkaTemplate;


}
