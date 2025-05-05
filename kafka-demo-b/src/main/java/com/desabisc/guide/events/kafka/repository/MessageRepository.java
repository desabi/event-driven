package com.desabisc.guide.events.kafka.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * MessageRepository class to store incoming messages.
 */
@Component
public class MessageRepository {
  private List<String> list = new ArrayList<>();

  public void addMessage(String messsage) {
    list.add(messsage);
  }

  public String getAllMessages() {
    return list.toString();
  }
}
