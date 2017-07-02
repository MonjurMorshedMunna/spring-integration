package com.oreilly.integration;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by Monjur-E-Morshed on 02-Jul-17.
 */
public class PrintService {

  public Message<?> print(Message<String> pMessage) {/*
    MessageHeaders headers = pMessage.getHeaders();
    for (Map.Entry<String, Object> entry : headers.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }*/
    int messageNumber = (int) pMessage.getHeaders().get("messageNumber");
    System.out.println(pMessage.getPayload());

    return MessageBuilder.withPayload("Sending a reply for message " + messageNumber).build();
  }

}
