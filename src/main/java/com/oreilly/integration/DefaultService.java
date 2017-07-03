package com.oreilly.integration;

import org.springframework.messaging.Message;

/**
 * Created by Monjur-E-Morshed on 03-Jul-17.
 */
public class DefaultService {
  public void print(Message<?> pMessage) {/*
    MessageHeaders headers = pMessage.getHeaders();
    for (Map.Entry<String, Object> entry : headers.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }*/

    System.out.println("Printing from the default service: " + pMessage.getPayload());
  }
}
